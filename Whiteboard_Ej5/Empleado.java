import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {

	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private float sueldo;

	// Constructor
	public Empleado(){
		
	}

	public Empleado(String nombre, String apellido, String fechaNacimiento, String sueldo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.sueldo = Float.parseFloat(sueldo);
	}
	
	//Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void setFechaNacimiento(String fechaNacimiento){
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public void setSueldo(String sueldo){
		this.sueldo = Float.parseFloat(sueldo);
	}

	//Getters
	public String getNombre(){
		return nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public LocalDate getFechaNacimiento(){
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