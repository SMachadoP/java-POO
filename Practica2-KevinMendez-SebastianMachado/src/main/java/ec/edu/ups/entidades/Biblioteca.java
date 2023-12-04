package ec.edu.ups.entidades;
import java.util.ArrayList;

public class Biblioteca {
	
	private String nombre;
	private String direccion;
	private ArrayList<Libro> listaLibros;
	private ArrayList<Usuario> listaUsuarios;
	
	// Constructor
	public Biblioteca(String nombre, String direccion, ArrayList<Libro> listaLibros, ArrayList<Usuario> listaUsuarios) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaLibros = listaLibros;
		this.listaUsuarios = listaUsuarios;
	}
	
	//Metodos pedidos en la rubrica
	
	public void agregarLibro(Libro libro) {
		//Se agrega libro a lista(creo):
	}
	public void registrarUsuario(Usuario usuario) {
		//Usuario tiene que ser agregado al lista:
	}
	public String buscarLibro(String libro) {
		//Se tiene que buscar libro:
		return "libro fue encontrado";
	}
	public void prestarLibro(Libro libro, Usuario usuario) {
	}
	
    // Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
	
}
