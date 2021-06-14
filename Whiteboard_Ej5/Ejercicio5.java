import java.io.*;

public class Ejercicio5 {
	
	

	public static void main(String[] args){
		
		String linea;

		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("empleados.txt"));
			linea = reader.readLine();

			while (linea != null){
				System.out.println(linea);
				linea = reader.readLine();
			}

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}


	}	
}