package pkCrud;

import java.sql.*;
import javax.swing.JOptionPane;
import pkClases.cCategoria;
import pkConexion.cConexion;

public class cCrudCategoria {

    public void insertarCategoria(cCategoria categoria) throws SQLException {
        Connection con = cConexion.getConnection();
        try {
            String llamarSP = "{call CREARCATEGORIA(?,?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, categoria.getIdCategoria());
            cst.setString(2, categoria.getNombre());

            cst.execute();

            JOptionPane.showMessageDialog(null, "Categoria agregada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la categoria: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

}
