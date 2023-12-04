package ec.edu.ups.entidades;

public abstract class Persona {
	//Atributos
	private String nombre;
	private String identificacion;

	//constructor
	public Persona(String nombre, String identificacion) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
	}
	public abstract void mostrarInformacion();

	//SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
}
