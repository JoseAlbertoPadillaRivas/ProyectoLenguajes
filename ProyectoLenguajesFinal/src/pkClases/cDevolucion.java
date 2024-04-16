
package pkClases;

public class cDevolucion {
    private int idDevolucion;
    private int idReserva;
    private String fechaEntrega;
    private String estadoDevolucion;

    public cDevolucion(int idDevolucion, int idReserva, String fechaEntrega, String estadoDevolucion) {
        this.idDevolucion = idDevolucion;
        this.idReserva = idReserva;
        this.fechaEntrega = fechaEntrega;
        this.estadoDevolucion = estadoDevolucion;
    }

    public cDevolucion(int idReserva) {
        this.idReserva = idReserva;
    }

    public cDevolucion(int idReserva, String fechaEntrega, String estadoDevolucion) {
        this.idReserva = idReserva;
        this.fechaEntrega = fechaEntrega;
        this.estadoDevolucion = estadoDevolucion;
    }  

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoDevolucion() {
        return estadoDevolucion;
    }

    public void setEstadoDevolucion(String estadoDevolucion) {
        this.estadoDevolucion = estadoDevolucion;
    }
    
    
    
}
