/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package prueba;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class Prueba {

    public static void main(String[] args) {

        //instancia
        Persona juan =  new Persona("Juan");
        
        Perro myPerro = new Perro("Doggy", 5);

        //objeto de tipo escaner
        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese su nombre: ");

        String nombre = lectura.next();

        juan.setNombre(nombre);

        juan.Saludar();
        
    }
}

