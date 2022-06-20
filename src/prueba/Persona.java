/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author hecto
 */
public class Persona {
    
    //atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    
    //constructor
    public Persona(){
        
        
    }
    
    public Persona(String p_nombre){
        
        nombre = p_nombre;
    
    }
    
    public Persona (String p_cedula, String p_nombre, String p_apellido, String p_telefono, int p_edad){
        
        cedula = p_cedula;
        nombre = p_nombre;
        apellido = p_apellido;
        telefono = p_telefono;
        edad = p_edad;          
        
    }
    
    //funcionas
    public void Saludar(){
    
        System.out.println("Hola Soy, " + nombre);
    
    }
    
    public void setNombre(String p_nombre){
        
        nombre = p_nombre;
                
        
    }
    
    
}
