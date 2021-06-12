public class Empleado {

	private String nombYApell;
	private int dni;
	private int horasTrabajadas;
	private int valorPorHora;

	// Constructor
	public Empleado(){
		
	}

	public Empleado(String nombYApel, int dni, int horasTrabajadas, int valorPorHora){
		this.nombYApell = nombYApell;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.valorPorHora = valorPorHora;
	}
	
	//Setters
	public void setNombYAp(String nombYApell){
		this.nombYApell = nombYApell;
	}

	public void setDni(int dni){
		this.dni = dni;
	}

	public void setHorasT(int horasTrabajadas){
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setValor(int valorPorHora){
		this.valorPorHora = valorPorHora;
	}

	//Getters
	public String getNombYAp(){
		return nombYApell;
	}

	public int getDni(){
		return dni;
	}

	public int getHorasT(){
		return horasTrabajadas;
	}

	public int getValor(){
		return valorPorHora;
	}

	public int sueldoCalculado(){
		return this.horasTrabajadas * this.valorPorHora;
	}

	@Override
	public String toString() {
		return this.nombYApell 
		+ " - " + String.valueOf(this.dni)
		+ " - " + String.valueOf(this.horasTrabajadas) 
		+ " - " + String.valueOf(this.valorPorHora);
	}

}