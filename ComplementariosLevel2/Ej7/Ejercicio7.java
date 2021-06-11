/**
 * Ejercicio 7:
 * 
 * Crear una función que dado 2 argumentos (int, siendo el primero menor al 
 * segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de 
 * principio a final. Pero si el numero es multiplo de 2 colocara el valor Fizz, si es multiplo de 3 Buzz 
 * y si es a la vez múltiplo de ambos colocara FizzBuzz
 * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
 * segundo con qué valor debe frenar (no se incluye en el cálculo)
 * Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
 *
 */


import java.util.*;


public class Ejercicio7 {
    
    public static String[] fizzBuzzFunction(int inicio, int fin) {
        
        String[] array = new String[fin - inicio];
        int cont = 0;

        for (int i = inicio; i < fin; i++) {
            
            if ((i % 2) == 0) {
                if ((i % 3) == 0) {
                    array[cont] = "FizzBuzz";                    
                } else {
                    array[cont] = "Fizz";
                }
            } else if ((i % 3) == 0) {
                array[cont] = "Buzz";
            } else {
                array[cont] = String.valueOf(i);
            }

            cont++;
        }

        return array;
    }

    public static void main(String[] args){
        
        String[] fizzBuzz;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un valor inicial: ");
        int inicio = input.nextInt();
        System.out.println("Ingrese un valor final: ");
        int fin = input.nextInt();

        fizzBuzz = fizzBuzzFunction(inicio, fin);
        
        int cont = 0;

        for (String fizz: fizzBuzz) {
            
            System.out.println(fizzBuzz[cont]);
            cont++;
        }


        input.close();
    }    
}