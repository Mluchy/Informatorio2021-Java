/**
 * Ejercicio 4:
 * 
 * Realizar un programa que calcule el factorial de un número
 * Sin hacer uso de librerías.
 *
 */

import java.util.*;

public class Ejercicio4 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese un valor");
		int nro = input.nextInt();
		int factorial = 1;

		for (int i = 1; i <= nro; i++) {
			factorial = factorial * i;
		}

		System.out.printf("El factorial de %d es: %d", nro, factorial);
		input.close();
	}	
}