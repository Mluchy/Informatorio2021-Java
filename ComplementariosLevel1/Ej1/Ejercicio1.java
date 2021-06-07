/**
 * Ejercicio 1:
 * 
 * Solicita por consola el nombre del usuario e imprime por pantalla el siguiente mensaje
 * "HOLA {usuario}"  
 *
 */

import java.util.*;

public class Ejercicio1 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese su nombre de usuario");
		String nombre = input.nextLine();
		System.out.printf("HOLA %s\n", nombre);
		input.close();
	}	
}