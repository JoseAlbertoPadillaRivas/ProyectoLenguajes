package pkCrud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;
import pkClases.cLibro;
import pkConexion.cConexion;

public class cCrudLibro {

    public void agregarLibro(cLibro libro) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            CallableStatement cst = con.prepareCall("{call paqueteLibros.INSERTAR_LIBRO(?, ?, ?, ?, ?)}");

            cst.setInt(1, libro.getIdLibro());
            cst.setString(2, libro.getNombre());
            cst.setInt(3, libro.getNumeroPaginas());
            cst.setInt(4, libro.getIdCategoria());
            cst.setString(5, libro.getFechaPublicacion());

            cst.execute();
            JOptionPane.showMessageDialog(null, "LIBRO agregado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el LIBRO: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public List<cLibro> ObtenerLibros() throws SQLException {
        Connection con = cConexion.getConnection();
        List<cLibro> listaLibros = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = con.prepareCall("{call paqueteLibros.mostrar_libros(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);

            cs.execute();

            rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {
                int idLibro = rs.getInt("idLibro");
                String nombre = rs.getString("NOMBRE");
                int numeroPaginas = rs.getInt("numeroPaginas");
                int idCategoria = rs.getInt("idCategoria");
                String fechaPublicacion = rs.getString("fechaPublicacion");
                cLibro libro = new cLibro(idLibro, nombre, numeroPaginas, idCategoria, fechaPublicacion);
                listaLibros.add(libro);
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
        return listaLibros;
    }

    public void editarLibro(cLibro libro) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String sql = "{call paqueteLibros.sp_modificar_libro(?,?,?,?,?)}";
            CallableStatement cst = con.prepareCall(sql);

            cst.setInt(1, libro.getIdLibro());
            cst.setString(2, libro.getNombre());
            cst.setInt(3, libro.getNumeroPaginas());
            cst.setInt(4, libro.getIdCategoria());
            cst.setString(5, libro.getFechaPublicacion());

            cst.execute();

            JOptionPane.showMessageDialog(null, "Libro editado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el Libro: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void eliminarLibro(cLibro libro) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call paqueteLibros.eliminarLibro(?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, libro.getIdLibro());
            cst.execute();

            JOptionPane.showMessageDialog(null, "Libro eliminado");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
