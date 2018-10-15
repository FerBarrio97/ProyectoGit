/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno34
 */
public class PruebaContacto {
    
    public static void main(String[] args) {
        
        Contacto contacto1 = new Contacto("Pepe", "967676767");
        Contacto contacto2 = new Contacto("Juan", "967121212");
        
        Contacto.setNumerodecontactos(2);
        
        System.out.println("Nº contactos: "
                + Contacto.getNumerodecontactos());
        
        System.out.println("Contacto 1: "
                + contacto1.getNombre());
        
        System.out.println("Contacto 2: "
                + contacto2.getNombre());
        
        
        
        
        
    }
    
}
