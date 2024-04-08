
package pkClases;

public class cCategoria {
   private int IdCategoria;  
   private String Nombre;  

    public cCategoria(int IdCategoria, String Nombre) {
        this.IdCategoria = IdCategoria;
        this.Nombre = Nombre;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   
   
}
