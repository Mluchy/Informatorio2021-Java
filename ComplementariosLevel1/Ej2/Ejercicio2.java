/**
 * Ejercicio 2:
 * 
 * Realizar un programa que solicite por consola 2 números enteros. Para luego
 * imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
 * de la división) de ambos números.
 *
 */
import java.util.*;

public class Ejercicio2 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese dos numeros enteros");
		int nro1 = input.nextInt();
		int nro2 = input.nextInt();
		System.out.printf("%1$d + %2$d = %3$d"
			+ "%n%1$d - %2$d = %4$d" 
			+ "%n%1$d * %2$d = %5$d"
			+ "%n%1$d / %2$d = %6$d"
			+ "%n%1$d %%  %2$d = %7$d", 
			nro1, nro2, (nro1 + nro2), (nro1 - nro2), (nro1 * nro2), (nro1 / nro2), (nro1 % nro2));
		input.close();
	}	
}