/**
 * Ejercicio 7:
 * 
 * Realizar un Programa que dado un String de entrada en minúsculas 
 * lo convierta por completo a mayúsculas. 
 * Sin uso de métodos o librerías querealicen toUppercase().
 *
 */

import java.util.*;

public class Ejercicio7 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String palabra = input.nextLine();

		System.out.printf("%S", palabra);
		input.close();
	}	
}