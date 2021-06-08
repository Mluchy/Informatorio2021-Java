/**
 * Ejercicio 1:
 * 
 * Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
 * luego imprimir por pantalla el ranking
 *
 */

import java.util.*;

public class Ejercicio1 {
    
    public static void cargarLista(List<String> ciudades) {
        ciudades.add("Salta");
        ciudades.add("Villa Carlos Paz");
        ciudades.add("Resistencia");
        ciudades.add("Corrientes");
        ciudades.add("Buenos Aires");
    }
    
    public static void main(String[] args){
    
        List<String> ciudades = new ArrayList<>(); 
        cargarLista(ciudades);
        
        int cont = 1;
        System.out.println("-- Ranking ciudades --");

        for (String ciudad: ciudades) {
            System.out.println("#" + cont++ + " - " + ciudad);
        }          

    }   


}