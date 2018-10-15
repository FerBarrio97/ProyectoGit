/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno34
 */
public class Contacto {
    
    private String nombre;
    private String tlfono;
    private String alias;
    private String apellidos;
    private static int numerodecontactos = 0;

    public Contacto(String nombre, String tlfono) {
        this.nombre = nombre;
        this.tlfono = tlfono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTlfono() {
        return tlfono;
    }

    public void setTlfono(String tlfono) {
        this.tlfono = tlfono;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static int getNumerodecontactos() {
        return numerodecontactos;
    }

    public static void setNumerodecontactos(int numerodecontactos) {
        Contacto.numerodecontactos = numerodecontactos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
