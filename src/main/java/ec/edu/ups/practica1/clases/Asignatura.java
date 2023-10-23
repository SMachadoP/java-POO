package ec.edu.ups.practica1.clases;

public class Asignatura {
	private String nombre;
	private String codigoE;
	//GENERAR CONSTRUCTOR VACIO
	public Asignatura() {
		
	}
	//GENERAR CONSTRUCTOR
	public Asignatura(String nombre, String codigoE) {
		super();
		this.nombre = nombre;
		this.codigoE = codigoE;
	}
	//GENERAR GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoE() {
		return codigoE;
	}

	public void setCodigoE(String codigoE) {
		this.codigoE = codigoE;
	}
	//GENERAR toString
	@Override
	public String toString() {
		return "Nombre Asignatura:" + nombre + " " +"CodigoE:" + codigoE;
	}
	

}
