/**
 * Ejercicio 2:
 * 
 * Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número 
 * entero al principio de la lista y otro al final. Por último, iterar e imprimir los 
 * elementos de la lista y el tamaño de la misma (antes y después de agregar a
 * en la primera y última posición).
 *
 */

import java.util.*;

public class Ejercicio2 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void cargarLista(List<Integer> numeros) {
            
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ") Ingrese un numero entero: ");
            numeros.add(input.nextInt()); 
        }

        input.nextLine();
    
    } 

    public static void agregar(List<Integer> numeros) {
    
        System.out.println("Ingrese valor inicial: ");
        numeros.add(0, input.nextInt()); 
        
        System.out.println("Ingrese valor final: ");
        numeros.add(input.nextInt()); 
        
    } 

    public static void main(String[] args){
        
        List<Integer> numeros = new ArrayList<>();
        
        cargarLista(numeros);

        System.out.println(numeros);
        System.out.println("Tamaño inicial: " + numeros.size( )); 

        agregar(numeros);

        System.out.println(numeros);
        System.out.println("Tamaño final: " + numeros.size( )); 

    }   

}