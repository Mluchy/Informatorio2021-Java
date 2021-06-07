/**
 * Ejercicio 9:
 * 
 * Dado un String de entrada (frase, texto, etc) calcular la cantidad de 
 * veces queaparece una letra dada.
 *
 */

import java.util.*;

public class Ejercicio9 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un texto:");
		String txt = input.nextLine();
		System.out.println("Letra a contar:");
		String letra = input.nextLine();
		
		int cont = 0;

		for (int i = 1; i <= (txt.length() - 1); i++) {
			if (letra.charAt(0) == txt.charAt(i)) {
				cont++;
			}
		}

		System.out.println(cont);
		input.close();
	}	
}