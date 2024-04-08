package pkClases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pkConexion.cConexion;

public class cLogin {

    public boolean autenticarUsuario(String username, String password) {
        Connection con = cConexion.getConnection();

        try {
            String query = "SELECT * FROM usuario WHERE username = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();
        } catch (Exception e) {
            System.out.println("Error en autenticación: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
}
