/**
 * Ejercicio 8:
 * 
 * Crear una aplicación que solicite de entrada los datos de una persona en este orden:
 * Nombre y Apellido
 * Edad
 * Dirección
 * Ciudad
 * 
 * Luego imprimirá el siguiente mensaje:
 * {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 *
 */

import java.util.*;

public class Ejercicio8 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-- Complete los siguientes datos --");
		System.out.print("Nombre y Apellido: ");
		String nombre = input.nextLine();
		System.out.print("Edad: ");
		String edad = input.nextLine();
		System.out.print("Direccion: ");
		String dir = input.nextLine();
		System.out.print("Ciudad: ");
		String ciudad = input.nextLine();
		
		System.out.printf("%s - %s - %s - %s", ciudad, dir, edad, nombre);

		input.close();
	}	
}