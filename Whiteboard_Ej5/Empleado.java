public class Empleado {

	private String nombre;
	private String apellido;
	private int fechaNacimiento;
	private float sueldo;
	

	// Constructor
	public Empleado(){
		
	}

	public Empleado(String nombre, String apellido, int fechaNacimiento, float sueldo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldo = sueldo;
	}
	
	//Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void setFechaNacimiento(int fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setSueldo(float sueldo){
		this.sueldo = sueldo;
	}


	//Getters
	public String getNombre(){
		return nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public getFechaNacimiento(){
		return fechaNacimiento;
	}

	public float getSueldo(){
		return sueldo;
	}


	@Override
	public String toString() {
		return this.nombre
		+ " - " + this.apellido 
		+ " - " + String.valueOf(this.fechaNacimiento)
		+ " - " + String.valueOf(this.sueldo);
	}

}