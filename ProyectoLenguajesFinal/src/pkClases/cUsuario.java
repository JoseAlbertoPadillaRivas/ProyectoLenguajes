package pkClases;

public class cUsuario {
    private int cedula;
    private String nombre;
    private String apellidos;
    private String username;
    private String password;
    private int idrol; 

    public cUsuario(int cedula, String nombre, String apellidos, String username, String password, int idrol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.username = username;
        this.password = password;
        this.idrol = idrol;
    }

    public cUsuario(int cedula, String nombre, String apellidos, String username, int idrol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.username = username;
        this.idrol = idrol;
    }

    public cUsuario(int cedula) {
       this.cedula = cedula;
    }

    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    
    

    


    
    

 
    
    
}
