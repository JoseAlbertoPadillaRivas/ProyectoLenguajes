
package pkCrud;

import java.sql.*;
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

            JOptionPane.showMessageDialog(null, "Reserva completada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la reserva: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}

