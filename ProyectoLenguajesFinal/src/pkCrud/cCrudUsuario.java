package pkCrud;

import pkClases.cUsuario;
import pkConexion.cConexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class cCrudUsuario {

    public void insertarUsuario(cUsuario usuario) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call CREARUSUARIO(?,?,?,?,?,?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, usuario.getCedula());
            cst.setString(2, usuario.getNombre());
            cst.setString(3, usuario.getApellidos());
            cst.setString(4, usuario.getUsername());
            cst.setString(5, usuario.getPassword());
            cst.setInt(6, usuario.getIdrol());

            cst.execute();

            JOptionPane.showMessageDialog(null, "Usuario agregado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el usuario: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public List<cUsuario> ObtenerUsuarios() throws SQLException {
        Connection con = cConexion.getConnection();
        List<cUsuario> listaUsuarios = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = con.prepareCall("{call mostrar_usuarios(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);

            cs.execute();

            rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {
                int cedula = rs.getInt("CEDULA");
                String nombre = rs.getString("NOMBRE");
                String apellidos = rs.getString("APELLIDOS");
                String username = rs.getString("USERNAME");
                int idrol = rs.getInt("IDROL");
                cUsuario usuario = new cUsuario(cedula, nombre, apellidos, username, idrol);
                listaUsuarios.add(usuario);
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
        return listaUsuarios;
    }

    public void editarUsuario(cUsuario usuario) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call sp_modificar_usuario(?,?,?,?,?,?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, usuario.getCedula());
            cst.setString(2, usuario.getNombre());
            cst.setString(3, usuario.getApellidos());
            cst.setString(4, usuario.getUsername());
            cst.setString(5, usuario.getPassword());
            cst.setInt(6, usuario.getIdrol());

            cst.execute();

            JOptionPane.showMessageDialog(null, "Usuario editado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el usuario: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void eliminarUsuario(cUsuario usuario) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call EliminarUsuario(?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, usuario.getCedula());
            cst.execute();

            JOptionPane.showMessageDialog(null, "Usuario eliminado");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
