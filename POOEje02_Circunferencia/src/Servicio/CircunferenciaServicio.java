
package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia Circulo(){
        
        Circunferencia c1 = new Circunferencia();
        return c1; 
        }
    
    public void crearCircunferencia(Circunferencia c1){
        
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
    }
    
    public void area(Circunferencia c1){
        
        Double area = (3.14*(c1.getRadio()*c1.getRadio()));
        System.out.println("Area: " + area);
        
    }
    public void perimetro(Circunferencia c1){
        
        Double perimetro = (2*3.14*(c1.getRadio()));
        System.out.println("Perimetro: " + perimetro);
    } 
    
}
