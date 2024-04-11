
package pkCrud;

import pkClases.cRol;
import pkConexion.cConexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;


public class cCrudRol {
   
     public void insertarRol(cRol rol) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call insertarRol(?,?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, rol.getIdRol());
            cst.setString(2, rol.getRol());
           
            cst.execute();

            JOptionPane.showMessageDialog(null, "Rol agregado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el rol: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
     
     public List<cRol> ObtenerRoles() throws SQLException {
        Connection con = cConexion.getConnection();
        List<cRol> listaRoles = new ArrayList<>();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = con.prepareCall("{call mostrar_roles(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);

            cs.execute();

            rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {
                int IdRol = rs.getInt("IDROL");
                String Rol = rs.getString("ROL");
                
                cRol rol = new cRol( IdRol,Rol);
                listaRoles.add(rol);
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
        return listaRoles;
    }
     
     
      public void editarRol(cRol rol) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call sp_modificar_rol(?,?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, rol.getIdRol());
            cst.setString(2, rol.getRol());
           

            cst.execute();

            JOptionPane.showMessageDialog(null, "Rol editado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el rol: " + e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public void eliminarRol(cRol rol) throws SQLException {
        Connection con = cConexion.getConnection();

        try {
            String llamarSP = "{call EliminarRol(?)}";
            CallableStatement cst = con.prepareCall(llamarSP);

            cst.setInt(1, rol.getIdRol());
            cst.execute();

            JOptionPane.showMessageDialog(null, "rol eliminado");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
