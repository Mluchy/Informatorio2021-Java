/**
 * Ejercicio 3:
 * 
 * Confeccionar un programa que dado un número entero como dato de entrada 
 * imprima la secuencia de números (incrementos de 1)
 * 
 */

import java.util.*;

public class Ejercicio3 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int nro = input.nextInt();
        String cadena = "";

        for (int i = 1; i <= nro; i++) {
            cadena = cadena + String.valueOf(i);     
            System.out.println(cadena);
         } 

        input.close();
    }    
}