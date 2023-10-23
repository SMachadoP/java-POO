package ec.edu.ups.practica1.clases;

public class Profesor {
	//ATRIBUTOS DE LA CLASE: Profesor
	private String nombre;
	private String conocimiento;
	private String especialidad;
	//GENERAR CONSTRUCTOR VACIO
	public Profesor() {
		
	}
	//GENERAR CONSTRUCTOR
	public Profesor(String nombre, String conocimiento, String especialidad) {
		super();
		this.nombre = nombre;
		this.conocimiento = conocimiento;
		this.especialidad = especialidad;
	}
	//GENERAR GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getConocimiento() {
		return conocimiento;
	}
	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	//GENERAR toString
	@Override
	public String toString() {
		return "Nombre Profesor:" + nombre +" " + "Conocimiento:" + conocimiento +" " + "Especialidad=" + especialidad;
	}
	
	
	
	
	
	

}
