
package reserva_asientos_parte2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import reserva_asientos_parte2.logica.Cliente;
import reserva_asientos_parte2.logica.Tiket;

/**
 *
 * @author c24ei
 */
public class Reserva_asientos_parte2 {

 
    public static void main(String[] args) {
        //estructura para guardar los tikets
        List <Tiket>listaTikets = new ArrayList <Tiket>();
        //creamos 3 tikets
        Tiket ticket1 = new Tiket(12, 1, 3, 1500, new Date(), new Date());
        Tiket ticket2 = new Tiket(1, 1, 1, 1500, new Date(), new Date());
        Tiket ticket3 = new Tiket();
        
        //asignar con set (encapsulamiento)
        ticket3.setNumero(20);
        ticket3.setFila(5);
        ticket3.setAsiento(1);
        ticket3.setPrecio(2300);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        
        //agregamos elementos a la lista
        listaTikets.add(ticket1);
        listaTikets.add(ticket2);
        listaTikets.add(ticket3);
          
        //suma de precios 
        double suma= 0;
        for(Tiket tick:listaTikets){
            suma += tick.getPrecio();
        }
        System.out.println("La suma de presions es:"+suma);
        
        //pedir fila al usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la fila de la que desea ver tickets");
        int fila = teclado.nextInt();
        
        //buscamos la fila en los objetos que tenemos
        boolean bandera = false;
           for(Tiket tick:listaTikets){
               if(tick.getFila() == fila){
                  System.out.println(tick.toString());
                  bandera = true;
           }
               
        }
           //si no se encontro esa fila
           if(bandera != true){
               System.out.println("No se encontraron datos de la fila en cuestion");
           }
           
           //prueba de cliente 
           Cliente cli = new Cliente();
           cli.setId(1);
           cli.setNombre("Isra");
           cli.setApellido("Luna");
           cli.setDni("12345678");
           cli.getListaTickets().add(ticket2);
           
           Tiket ticket4 = new Tiket(23, 4, 12, 4000, new Date(2024-11-23), new Date());
           cli.getListaTickets().add(ticket4);

           
           
           
    
    }
    
}
