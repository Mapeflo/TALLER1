/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1_1;

/**
 *
 * @author marya
 */
public class Taller1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Libro libro1 = new Libro ();   
    Libro libro2 = new Libro ("Cien años de soledad","Garcia Marquez", 500);
    
    CuentaBancaria cuenta1 = new CuentaBancaria ();
    CuentaBancaria cuenta2 = new CuentaBancaria (50465847, 100000, "Corriente");
    
    Estudiante estudiante1 = new Estudiante ();
    Estudiante estudiante2 = new Estudiante ("Maria", 16, "11-D");
    
    }
    
}
