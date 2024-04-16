
package pkClases;

public class cReservas {
    private int idReserva;
    private int cedula;
    private int idLibro;
    private String fechaReserva;
    private String fechaDevolucion;

    public cReservas(int cedula, int idLibro, String fechaReserva, String fechaDevolucion) {
        this.cedula = cedula;
        this.idLibro = idLibro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
    }

    public cReservas(int idReserva, int cedula, int idLibro, String fechaReserva, String fechaDevolucion) {
        this.idReserva = idReserva;
        this.cedula = cedula;
        this.idLibro = idLibro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
    }

    public cReservas(int idReserva) {
        this.idReserva = idReserva;
    }
    
    
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }    
    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    
}
