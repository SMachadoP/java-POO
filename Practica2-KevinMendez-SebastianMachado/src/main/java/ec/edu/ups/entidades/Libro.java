package ec.edu.ups.entidades;

public class Libro extends Persona implements Prestable {
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;
    //Constructor
    public Libro(String titulo, String autor, int anio, boolean disponible) {
        
        super(null, null);
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }

	@Override
    public void prestar() {
        // Implementation for prestar method
    }

    @Override
    public void devolver() {
        // Implementation for devolver method
    }

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		
	}
	
	//getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}	
	
	

