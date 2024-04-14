
package pkClases;

public class cCategoria {
   private int idCategoria;  
   private String nombre;  

    public cCategoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    public cCategoria(int idCategoria) {
    this.idCategoria = idCategoria;

    }

    public int getidCategoria() {
        return idCategoria;
    }

    public void setidCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
   
   
}
