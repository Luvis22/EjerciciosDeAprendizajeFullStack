
package Servicio;

import Entidades.Libro;
import java.util.Scanner;


public class LibroServicio {
    
     Scanner leer = new Scanner(System.in);
    
    public Libro cargarLibro(){
        
        //Instanciar un objetio tipo libro
        
        Libro l1 = new Libro();
       
        return l1;
   
    }
    public void cargarLibro1(Libro l1){
        
       
        System.out.println("Ingrese el número de ISBN");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el titulo del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el Nombre del Autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el número de paginas");
        l1.setNump(leer.nextInt());
        
        
    }
    
    public void mostrarLibro(Libro l1){
        
        System.out.println("Númeero ISBN: " + l1.getISBN());
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println(l1.getNump() + " Paginas");
    }
}
