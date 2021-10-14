package animales.service;

import animales.Perro;
import java.util.Scanner;

/**
 *
 * @author Felipe Herrera
 */
public class PerroService {
    
    public  Perro crearPerro() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese nombre del perro:");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese raza:");
        String raza = sc.nextLine();
        
        System.out.println("Ingrese edad:");
        int edad = Integer.parseInt(sc.nextLine());
        
        Perro nuevoPerro = new Perro();
        
        nuevoPerro.setNombre(nombre);
        nuevoPerro.setRaza(raza);
        nuevoPerro.setEdad(edad);
        
        return nuevoPerro;
    }
    
}
