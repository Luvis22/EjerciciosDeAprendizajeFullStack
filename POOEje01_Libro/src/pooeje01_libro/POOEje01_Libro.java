
package pooeje01_libro;

import Entidades.Libro;
import Servicio.LibroServicio;


public class POOEje01_Libro {

    public static void main(String[] args) {
        
        LibroServicio lb = new LibroServicio();
        Libro l1 = lb.cargarLibro();
        lb.cargarLibro1(l1);
        lb.mostrarLibro(l1);
        
    }
    
}
