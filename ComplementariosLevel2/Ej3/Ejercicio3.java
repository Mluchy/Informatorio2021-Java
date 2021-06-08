/**
 * Ejercicio 3:
 * 
 * Crear una lista que contenga como elementos la numeración de cartas de una
 * baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
 * orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
 * arrayList y volver a imprimir.
 *
 */

import java.util.*;

public class Ejercicio3 {
     
    public static void cargarLista(List<Integer> barajas) {
        
        for (int i = 1; i <= 13; i++) {
            barajas.add(i);        
        }
    
    }

    public static void main(String[] args){

        List<Integer> barajas = new ArrayList<>();

        cargarLista(barajas);

        System.out.println("En orden:");
        System.out.println(barajas);

        System.out.println("En orden inverso:");
        Collections.reverse(barajas);
        System.out.println(barajas);

        System.out.println("Mezcladas:");
        Collections.shuffle(barajas);
        System.out.println(barajas);

    }    
}