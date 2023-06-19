/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje1;

import java.util.Scanner;

/**
 *
 * @author luvisc
 */
public class servicioEje1 {
    
    Scanner leer = new Scanner(System.in);
    
     public cargar Libro(){
        
        //instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        //lleno los atributos
       
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año que comenzo a trabajar");
        int año = leer.nextInt();
        Date fecha = new Date(año-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
}
