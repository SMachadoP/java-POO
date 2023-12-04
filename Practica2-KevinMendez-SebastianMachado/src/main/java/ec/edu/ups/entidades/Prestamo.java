package ec.edu.ups.entidades;
import java.sql.Date;
import java.time.LocalDate;

public class Prestamo {
	//Atributos
	private Libro libro;
	private Usuario usuario;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	//constructor
	public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
		
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo) {
		
		this.libro = libro;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
	}
	public Prestamo(Libro libro, Usuario usuario) {
		
		this.libro = libro;
		this.usuario = usuario;
		
	}

	public void calcularDiasPrestamo() {
		
	}
	
	//ajustar dependiendo del programa 
	public boolean esPrestamoVigente() {
		return true;
	}
	
	//GETTERS AND SETTERS
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}	
}
