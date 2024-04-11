/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkClases;

/**
 *
 * @author krisc
 */
public class cRol {
    
   private int IdRol;  
   private String Rol; 

    public cRol(int IdRol, String Rol) {
        this.IdRol = IdRol;
        this.Rol = Rol;
    }

    public cRol() {
    }

    public cRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
   
}
