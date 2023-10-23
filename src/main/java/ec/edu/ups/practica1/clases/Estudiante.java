package ec.edu.ups.practica1.clases;

public class Estudiante {
	//ATRIBUTOS DE LA CLASE: Estudiante
	private String nombre;
	private Integer edad;
	private String identificacionM;
	//GENERAR CONSTRUCTOR VACIO
	public Estudiante(){
		
	}
	//GENERAR CONSTRUCTOR
	public Estudiante(String nombre, Integer edad, String identificacionM) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.identificacionM = identificacionM;
	}
	//GENERAR GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getIdentificacionM() {
		return identificacionM;
	}
	public void setIdentificacionM(String identificacionM) {
		this.identificacionM = identificacionM;
	}
	//GENERAR toString
	@Override
	public String toString() {
		return "Nombre Estudiante:" + nombre +" " + "Edad:" + edad + " " +"IdentificacionM:" + identificacionM;
	}
	
	

}
