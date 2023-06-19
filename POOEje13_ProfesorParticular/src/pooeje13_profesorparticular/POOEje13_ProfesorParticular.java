/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje13_profesorparticular;

import entidades.Curso;
import servicios.serviciosCurso;

/**
 *
 * @author luvisc
 */
public class POOEje13_ProfesorParticular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        serviciosCurso cursonew1 = new serviciosCurso();
        
        Curso c1 = cursonew1.crearCurso();
        cursonew1.calcularGananciaSemanal();
        System.out.println(c1);
        
        Curso c2 = cursonew1.crearCurso();
        cursonew1.calcularGananciaSemanal();
        System.out.println(c2);
        
        
        
    }
    
}
