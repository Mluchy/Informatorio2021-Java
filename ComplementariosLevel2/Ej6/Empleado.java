public class Empleado {

	private String nombYApell;
	private int dni;
	private int horasTrabajadas;
	private int valorPorHora;

	// Constructor
	public Empleado(){
		
	}

	public Empleado(int dni, String nombre, String apellido){
		this.dni = dni;
		this.nombYApell = nombYApell;
		this.horasTrabajadas = horasTrabajadas;
		this.valorPorHora = valorPorHora;
	}
	
	// reescribir lo del constructor

	@Override
	public String toString() {
		return String.valueOf(this.dni) 
		+ " - " + this.nombYApell 
		+ " - " + this.horasTrabajadas 
		+ " - " + this.valorPorHora;
	}

	public int calcularSueldo(int horasTrabajadas, int valorPorHora) {
		return this.horasTrabajadas * this.valorPorHora;
	}

}