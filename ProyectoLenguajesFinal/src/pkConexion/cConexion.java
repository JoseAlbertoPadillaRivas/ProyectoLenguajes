
package pkConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class cConexion {
    
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    public static final String USER = "PROYECTOLENGUAJES"; //ProyectoLenguajesBD
    public static final String PASSWORD = "1234";
    
    public static Connection getConnection()
    {
    
        Connection con = null;
        
        try{
            
            con = (Connection)DriverManager.getConnection(URL, USER, PASSWORD);
             System.out.println("Conexion Exitosa");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en Conexion " + e.getMessage());
        }
        return con;
    }
    
}
