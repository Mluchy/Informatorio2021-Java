/**
 * Ejercicio 5:
 * 
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
 * valor-por-hora(array2) del resumen de carga de horas semanal de un
 * empleado. Se debe generar otra lista que contenga los totales y luego
 * imprimir el total final a cobrar.
 *
 */

import java.util.*;

public class Ejercicio5 {
    
    static  Scanner input = new Scanner(System.in);

    public static void cargarLista(List<Integer> lista) {

        for (int i = 0; i < 5; i++) {
            lista.add(input.nextInt());                   
        }           
    }

    public static int totales(List<Integer> lista1, List<Integer> lista2, List<Integer> totalesSemana) {

        int total = 0;
        
        for (int i = 0; i < 5; i++) {
            totalesSemana.add(lista1.get(i) * lista2.get(i)); 
            total = total + totalesSemana.get(i);
        }   
        
        return total;
    }


    public static void main(String[] args){
        
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorXHora = new ArrayList<>();
        List<Integer> totalesSemana = new ArrayList<>();
        int total;

        System.out.println("Carga de horas trabajadas");
        cargarLista(horasTrabajadas);

        System.out.println("Carga del valor por horas trabajadas");
        cargarLista(valorXHora);

        total = totales(horasTrabajadas, valorXHora, totalesSemana);
        System.out.println("Totales por día: " + totalesSemana);
        System.out.printf("Total Final: $%d\n", total);

    }    
}