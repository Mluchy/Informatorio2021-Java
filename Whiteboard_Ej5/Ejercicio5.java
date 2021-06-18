import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Ejercicio5 {
	
	public static void cargarLista(List<Empleado> empleados) {

		String path = "empleados.txt";
		String linea;
		String[] empLinea;
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			linea = reader.readLine();

			while (linea != null){
				empLinea = linea.split(",");
				Empleado emp = new Empleado(empLinea[0], empLinea[1], empLinea[2], empLinea[3]);
				empleados.add(emp);
				linea = reader.readLine();
			}	

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
	}

	public static void leerArchivo(List<Empleado> empleados) {

		for (Empleado empleado: empleados) {
				System.out.println(empleado);
		}

	}

	public static void ordenarPorLetra(List<Empleado> empleados, String letra) {
		
		for (Empleado empleado: empleados) {
			if (empleado.getApellido().startsWith(letra)) {
				System.out.println(empleado);
			}
		}

	}

	public static void masJoven(List<Empleado> empleados) {

		empleados.sort(Comparator.comparing(Empleado::getFechaNacimiento));
		System.out.println(String.format("Nombre: %s \nApellido: %s \nEdad: %d \nSueldo: %.2f",
			empleados.get(empleados.size() - 1).getNombre(), 
			empleados.get(empleados.size() - 1).getApellido(),
			empleados.get(empleados.size() - 1).calcularEdad(empleados.get(empleados.size() - 1).getFechaNacimiento()),
			empleados.get(empleados.size() - 1).getSueldo()));
	
	}

	public static void masViejo(List<Empleado> empleados) {

		empleados.sort(Comparator.comparing(Empleado::getFechaNacimiento));
		System.out.println(String.format("Nombre: %s \nApellido: %s \nEdad: %d \nSueldo: %.2f",
			empleados.get(0).getNombre(), 
			empleados.get(0).getApellido(),
			empleados.get(0).calcularEdad(empleados.get(0).getFechaNacimiento()),
			empleados.get(0).getSueldo()));
	
	}

	public static void ganaMas(List<Empleado> empleados) {

		empleados.sort(Comparator.comparing(Empleado::getSueldo));
		System.out.println(String.format("Nombre: %s \nApellido: %s \nSueldo: %.2f",
			empleados.get(empleados.size() - 1).getNombre(), 
			empleados.get(empleados.size() - 1).getApellido(),
			empleados.get(empleados.size() - 1).getSueldo()));	

	}

	public static void ganaMenos(List<Empleado> empleados) {

		empleados.sort(Comparator.comparing(Empleado::getSueldo));
		System.out.println(String.format("Nombre: %s \nApellido: %s \nSueldo: %.2f",
			empleados.get(0).getNombre(), 
			empleados.get(0).getApellido(),
			empleados.get(0).getSueldo()));	

	}

	public static void ordenarNombre(List<Empleado> empleados) {

		empleados.sort(Comparator.comparing(Empleado::getNombre).thenComparing(Empleado::getApellido));
		leerArchivo(empleados);

	}

	public static void ordenarApellido(List<Empleado> empleados) {

		empleados.sort(Comparator.comparing(Empleado::getApellido).thenComparing(Empleado::getNombre));
		leerArchivo(empleados);
	}

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int num = 1;

		while (num != 0){
			
			System.out.println("--------------------------------------------------");	
			System.out.println("MENU:");
			System.out.println("\t[1] - Mostrar toda la lista de empleados");
			System.out.println("\t[2] - Mostrar la lista de empleados con apellido que comienzan con ...");
			System.out.println("\t[3] - Mostrar el empleado mas joven");
			System.out.println("\t[4] - Mostrar el empleado mas viejo");
			System.out.println("\t[5] - Mostrar el empleado que gana mas");
			System.out.println("\t[6] - Mostrar el empleado que gana menos");
			System.out.println("\t[7] - Mostrar toda la lista de empleados ordenada por nombre");
			System.out.println("\t[8] - Mostrar toda la lista de empleados ordenada por apellido");
			System.out.println("\t[0] - SALIR");
			System.out.println("--------------------------------------------------");

			num = input.nextInt();
			List<Empleado> empleados = new ArrayList<>();
			cargarLista(empleados);
			String letra;

			switch(num) {
				case 1:
					leerArchivo(empleados);
					break;
				case 2:
					input.nextLine();
					System.out.print("Ingrese una letra: ");
					letra = input.nextLine().toUpperCase();
					ordenarPorLetra(empleados, letra);
					break;
				case 3:
					masJoven(empleados);
					break;
				case 4:
					masViejo(empleados);
					break;
				case 5:
					ganaMas(empleados);
					break;
				case 6:
					ganaMenos(empleados);
					break;
				case 7:
					ordenarNombre(empleados);
					break;
				case 8:
					ordenarApellido(empleados);
					break;
			} 
		
		}

		input.close();
	}	
}