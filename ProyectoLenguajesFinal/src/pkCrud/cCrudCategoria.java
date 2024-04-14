package pkCrud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;
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
    public List<cCategoria> ObtenerCategorias() throws SQLException {
        Connection con = cConexion.getConnection();
        List<cCategoria> listaCategorias = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = con.prepareCall("{call mostrar_categorias(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);

            cs.execute();

            rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {
                int IdCategoria = rs.getInt("IdCategoria");
                String Nombre = rs.getString("Nombre");
                
                cCategoria categoria = new cCategoria( IdCategoria,Nombre);
                listaCategorias.add(categoria);
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
        return listaCategorias;
    }
     
     
      public void editarCategoria(cCategoria categoria) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call sp_modificar_categoria(?,?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, categoria.getIdCategoria());
            cst.setString(2, categoria.getNombre());
           

            cst.execute();

            JOptionPane.showMessageDialog(null, "Categoria editado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar categoria: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void eliminarCategoria(cCategoria categoria) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call EliminarCategoria(?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, categoria.getIdCategoria());
            cst.execute();

            JOptionPane.showMessageDialog(null, "categoria eliminada");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    
    

}
