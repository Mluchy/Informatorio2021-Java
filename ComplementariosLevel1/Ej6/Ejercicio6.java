/**
 * Ejercicio 5:
 * 
 * Se desea una aplicación que solicite 2 números enteros y 
 * realice la operación de potencia 
 * (sin uso de librerías).
 *
 */

import java.util.*;

public class Ejercicio6 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Base: ");
		int nro1 = input.nextInt();
		System.out.print("Exponente: ");
		int nro2 = input.nextInt();
		int potencia = 1;


		for (int i = 1; i <= nro2; i++) {
			potencia = potencia * nro1;
		}
	
		System.out.printf("%d elevado a %d = %d", nro1, nro2, potencia);


		input.close();
	}	
}