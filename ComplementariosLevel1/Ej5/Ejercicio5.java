/**
 * Ejercicio 5:
 * 
 * Se desea una aplicación que solicite 2 números enteros y 
 * realice la operación de multiplicación por sumas sucesivas 
 * (sin uso de librerías)
 * 
 */

import java.util.*;

public class Ejercicio5 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresar dos numeros enteros");
		int nro1 = input.nextInt();
		int nro2 = input.nextInt();
		int suma = 0;


		for (int i = 1; i <= nro2; i++) {
			suma = suma + nro1;
		}
	
		System.out.printf("%d x %d = %d", nro1, nro2, suma);

		input.close();
	}	
}