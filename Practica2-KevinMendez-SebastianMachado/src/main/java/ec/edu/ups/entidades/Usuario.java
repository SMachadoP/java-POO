package ec.edu.ups.entidades;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
public class Usuario extends Persona{ //SE IMPLEMENTA HERENCIA (Usuario Hereda a persona)
	//Atributos
	private String correo;
	//SE IMPLEMENTA COMPOSICION (Prestamo no existe sin persona)
	private ArrayList<Prestamo> listaPrestamo;
	//constructor
	public Usuario(String nombre, String identificacion, String correo, ArrayList<Prestamo> listaPrestamo) {
		super(nombre, identificacion);
		this.correo = correo;
		this.listaPrestamo = listaPrestamo;
	}
	
	//metodo de composicion y sobrecarga
	public void agregarPrestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion){
	        listaPrestamo.add(new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion));
	    }
	public void agregarPrestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo){
			listaPrestamo.add(new Prestamo(libro, usuario, fechaPrestamo));
    }
	public void agregarPrestamo(Libro libro, Usuario usuario){
		listaPrestamo.add(new Prestamo(libro, usuario));
    }
	
	//Metodo abstracto de la clase Persona
	public void mostrarInformacion() {
		 System.out.println("Usuario: " + getNombre() + ", Correo: " + correo);
		    System.out.println("Prestamos:");
		    for (Prestamo prestamo : listaPrestamo) {
		        System.out.println("Libro: " + prestamo.getLibro().getTitulo()); 
		    }
	}
	//Metodos que pide la rubrica
	public void solicitarPrestamo(Libro libro) {
		
	}
	public void devolverLibro(Libro libro) {
		
	}
	
	//SETTERS Y GETTERS
	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public ArrayList<Prestamo> getListaPrestamo() {
		return listaPrestamo;
	}



	public void setListaPrestamo(ArrayList<Prestamo> listaPrestamo) {
		this.listaPrestamo = listaPrestamo;
	}
}
