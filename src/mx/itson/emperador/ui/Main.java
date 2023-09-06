
package mx.itson.emperador.ui;

import java.util.Scanner;
import mx.itson.emperador.negocio.Operacion;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el texto: ");
        
        
        Scanner scanner = new Scanner(System.in);
            
        String texto = scanner.nextLine();
        
        String [] elementos = new Operacion().separar(texto);
        
        for (String a : elementos){
            
            String [] nombres = a.split(" ");
            String ID = nombres [0];
            String nombre = nombres [3];
            String apellido = nombres[1];
            System.out.println(ID+" "+ nombre+" "+apellido);
        }
    
    
        
    }
}
