
package reserva_asientos_parte2.logica;

import java.util.List;

/**
 *
 * @author c24ei
 */
public class Cliente {
    
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    //relacionamos el tiket con el cliente 
    //un tiket puede pertenecer a un cliente pero un cliente puede tener mas de un tiket
    private List<Tiket>listaTickets;

    public Cliente(int id, String dni, String nombre, String apellido, List<Tiket> listaTickets) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaTickets = listaTickets;
    }

    public List<Tiket> getListaTickets() {
        return listaTickets;
    }

    public void setListaTickets(List<Tiket> listaTickets) {
        this.listaTickets = listaTickets;
    }

   
    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
