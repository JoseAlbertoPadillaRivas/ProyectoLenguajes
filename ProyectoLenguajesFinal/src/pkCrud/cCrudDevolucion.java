package pkCrud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;
import pkClases.cDevolucion;
import pkConexion.cConexion;

public class cCrudDevolucion {

    public void devolucion(int idReserva) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call sp_Devolucion(?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, idReserva);

            cst.execute();

            JOptionPane.showMessageDialog(null, "Devolucion completada");

        } catch (SQLException e) {
            System.out.println("Error al agregar la devolucion: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public List<cDevolucion> ObtenerDevoluciones() throws SQLException {
        Connection con = cConexion.getConnection();
        List<cDevolucion> listadevoluciones = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = con.prepareCall("{call mostrar_devoluciones(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);

            cs.execute();

            rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {               

                int idDevolucion = rs.getInt("idDevolucion");
                int idReserva = rs.getInt("idreserva");
                String fechaEntrega = rs.getString("fechaEntrega");
                String estadoDevolucion = rs.getString("estadoDevolucion");
                cDevolucion devolucion = new cDevolucion(idDevolucion, idReserva, fechaEntrega, estadoDevolucion);
                listadevoluciones.add(devolucion);
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
        return listadevoluciones;
    }

    public void editarDevolucion(cDevolucion devolucion) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String sql = "{call sp_modificar_devolucion(?,?,?,?)}";
            CallableStatement cst = con.prepareCall(sql);

            cst.setInt(1, devolucion.getIdDevolucion());
            cst.setInt(2, devolucion.getIdDevolucion());
            cst.setString(3, devolucion.getFechaEntrega());
            cst.setString(4, devolucion.getEstadoDevolucion());            

            cst.execute();

            JOptionPane.showMessageDialog(null, "Devolucion editada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar la devolucion: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void eliminarDevolucion(cDevolucion devolucion) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call EliminarDevolucion(?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, devolucion.getIdDevolucion());
            cst.execute();

            JOptionPane.showMessageDialog(null, "Devolucion eliminada");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
