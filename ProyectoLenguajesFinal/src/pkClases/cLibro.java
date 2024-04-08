
package pkClases;

public class cLibro {
    private int idLibro;
    private String nombre;
    private int numeroPaginas;
    private int idCategoria;
    private String fechaPublicacion;

    public cLibro(int idLibro, String nombre, int numeroPaginas, int idCategoria, String fechaPublicacion) {
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.numeroPaginas = numeroPaginas;
        this.idCategoria = idCategoria;
        this.fechaPublicacion = fechaPublicacion;
    }

    public cLibro(int idLibro) {
        this.idLibro = idLibro;
    }


    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    
}
