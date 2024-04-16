
package pkCrud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;
import pkClases.cReservas;
import pkConexion.cConexion;

public class cCrudReservas {
    
    public ResultSet buscarIdLibro(int id) throws SQLException {
        Connection con = cConexion.getConnection();
        CallableStatement stmt = null;
        ResultSet rs = null;

        try {
            String sql = "{ ? = call buscar_id(?) }";
            stmt = con.prepareCall(sql);
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
            stmt.setInt(2, id);
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return rs;
    }
    public void nuevaReserva(cReservas reserva) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call NUEVA_RESERVA(?,?,?,?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, reserva.getCedula());
            cst.setInt(2, reserva.getIdLibro());
            cst.setString(3, reserva.getFechaReserva());
            cst.setString(4, reserva.getFechaDevolucion());

            cst.execute();

            JOptionPane.showMessageDialog(null, "reserva completada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la reserva: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    public List<cReservas> ObtenerReserva() throws SQLException {
        Connection con = cConexion.getConnection();
        List<cReservas> listareservas = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = con.prepareCall("{call mostrar_reservas(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);

            cs.execute();

            rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {
                int idreserva = rs.getInt("idreserva");
                int cedula = rs.getInt("cedula");
                int idLibro = rs.getInt("idLibro");
                String fechareserva = rs.getString("fechareserva");
                String fechaDevolucion = rs.getString("fechaDevolucion");
                cReservas reserva = new cReservas(idreserva, cedula, idLibro, fechareserva, fechaDevolucion);
                listareservas.add(reserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            con.close();
        }
        return listareservas;
        }
    public void editarReserva(cReservas reserva) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String sql = "{call sp_modificar_reserva(?,?,?,?,?)}";
            CallableStatement cst = con.prepareCall(sql);

            cst.setInt(1, reserva.getIdReserva());
            cst.setInt(2, reserva.getCedula());
            cst.setInt(3, reserva.getIdLibro());
            cst.setString(4, reserva.getFechaReserva());
            cst.setString(5, reserva.getFechaDevolucion());

            cst.execute();

            JOptionPane.showMessageDialog(null, "Reserva editado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar la reserva: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void eliminarReserva(cReservas reserva) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call EliminarReserva(?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, reserva.getIdReserva());
            cst.execute();

            JOptionPane.showMessageDialog(null, "Reserva eliminada");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    
    
    
}
    
    


