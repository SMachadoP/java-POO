package ec.edu.ups.main;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import ec.edu.ups.entidades.*;
public class Principal {
	public static void main(String[] args) {
		System.out.println("BIENVENIDO A NUESTRO SISTEMA DE GESTION BIBLIOTECARIO:");
		
		//ArrayList DE LIBRO Y USUARIO PERTENECIENTE A LA BIBLIOTECA RUIZ ZAYANA
		 ArrayList<Libro> librosRuizZ = new ArrayList<>();
		 ArrayList<Usuario> usuariosRuizZ = new ArrayList<>();
		 
		 //INSTANCIA DE LA BIBLIOTECA
		Biblioteca ruizZayana = new Biblioteca("Ruiz Zayana Libreria GG", "Calle Loreta pizca", librosRuizZ, usuariosRuizZ );
		
		//Libros siendo agregados (LIBROS PREDETERMINADOS PERTENECIENTES A BIBLIOTECA)
		
				Libro libro1 = new Libro("La gran Burla", "Bonaparte Damian", 1965, true);
				Libro libro2 = new Libro("El fantasma", "Julian Castro.", 1965, true);
				librosRuizZ.add(libro1);
				librosRuizZ.add(libro2);
		
		//INSTANCIA DE USUARIO(SUPONIENDO QUE NUESTRO USUARIO YA EXISTE)
		ArrayList<Prestamo> prestamosUsuario1 = new ArrayList<>(); //Creando arraylist de prestamos (empieza vacia)
		Usuario usuario1 = new Usuario("Alexis4am", "ID123", "kevin@outlook.com", prestamosUsuario1);
		
		usuariosRuizZ.add(usuario1);
		
		while(true) {
			//menu interactivo
			System.out.println("");
			System.out.println("-------MENU------");
			System.out.println("1. Agregar libro");
			System.out.println("2. Registrar Usuario");
			System.out.println("3. Buscar Libro");
			System.out.println("4. Prestar libro");
			System.out.println("5. Devolver Libro");
			System.out.println("6. Salir");
			System.out.println("Ingrese la accion a realizar:");
			Scanner respuesta = new Scanner(System.in);
			int opcion = respuesta.nextInt();
			respuesta.nextLine();
			
			switch (opcion){
			
				case 1:
					System.out.println("-------REGISTRAR LIBRO------");
			        System.out.println("Ingrese el titulo del libro:");
			        String titulo = respuesta.nextLine();
			        System.out.println("Ingrese el Autor:");
			        String autor = respuesta.nextLine();
			        System.out.println("Ingrese el Anio de publicacion:");
			        int anio = respuesta.nextInt();
			        respuesta.nextLine();
			        boolean disponibilidad = true;
					Libro libroAgregar = new Libro(titulo, autor, anio, disponibilidad);
					librosRuizZ.add(libroAgregar);
					
					break;
					
				case 2:
					System.out.println("-------REGISTRAR USUARIO------");
					
					System.out.println("Nombre: ");
					String nombre = respuesta.nextLine();
					System.out.println("Identificacion: ");
					String identificacion = respuesta.nextLine();
					System.out.println("Correo: ");
					//-----
					String correo = respuesta.nextLine();
					ArrayList<Prestamo> prestamos = new ArrayList<>(); //Creando arraylist de prestamo uso libre
					Usuario usuario = new Usuario(nombre, identificacion, correo, prestamos);
					usuariosRuizZ.add(usuario);
					
					break;
					
				case 3:
					System.out.println("-------BUSCAR LIBRO------");
					System.out.println("Nombre del libro?: ");
					String nombreLibro = respuesta.nextLine();
					int control = 0;
				    for (Libro libros : ruizZayana.getListaLibros()) {
				        if(nombreLibro.equals(libros.getTitulo())) {
				        	System.out.println("Tu libro si esta disponible:");
				        	System.out.println("Titulo: " + libros.getTitulo());
				        	System.out.println("Autor: " + libros.getAutor());
				        	System.out.println("Anio: " + libros.getAnio());
				        	System.out.println("Disponible:" + libros.isDisponible());
				        	control = 1;
				        }
				    }
				    if(control == 0 ) {
				    	System.out.println("Libro no existente dentro de biblioteca...");
				    }
				    
					break;
					
				case 4:
					System.out.println("-------PRESTAR LIBRO------");
					int controlPrestamo = 0;
					System.out.println("Nombre del libro que desea pedir prestado?: ");
					//verificar nombre de libro
					String nombrePrestamo = respuesta.nextLine();
					boolean libroEncontrado = false;

					for (Libro libros : ruizZayana.getListaLibros()) {
					    if (nombrePrestamo.equals(libros.getTitulo())) {
					        libroEncontrado = true;
					        controlPrestamo = 1; // SI EXISTE LIBRO

					        if (libros.isDisponible()) {
					            System.out.println("Cual es su id: ");
					            // verificar identificacion
					            String nombreIdentificacion = respuesta.nextLine();
					            boolean usuarioEncontrado = false;

					            for (Usuario usuarioVerificar : ruizZayana.getListaUsuarios()) {
					                if (usuarioVerificar.getIdentificacion().equals(nombreIdentificacion)) {
					                    usuarioEncontrado = true;
					                    System.out.println("LISTO...PRESTAMO EXITOSO...");
					                    System.out.println("Fecha de prestamo:");
					                    LocalDate prestarDate = LocalDate.now();
					                    System.out.println(prestarDate);
					                    LocalDate devolverDate = prestarDate.plusDays(7);
					                    System.out.println("Fecha de devolucion(constante de 7 dias):");
					                    System.out.println(devolverDate);
					                    usuarioVerificar.agregarPrestamo(libros, usuarioVerificar, prestarDate, devolverDate);
					                    libros.setDisponible(false);
					                    break;
					                }
					            }

					            if (!usuarioEncontrado) {
					                System.out.println("No se puede encontrar su identificacion");
					            }
					        } else {
					            System.out.println("Libro en sistema pero no disponible.");
					        }
					    }
					}

					if (controlPrestamo == 0) {
					    System.out.println("Libro no existente dentro de biblioteca...");
					}

					if (!libroEncontrado) {
					    System.out.println("Libro no existente dentro de biblioteca...");
					}
					break;
					
				case 5:
					System.out.println("-------DEVOLVER LIBRO LIBRO------");
					System.out.print("Ingrese la identificación del usuario: ");
					String identificacionBuscar = respuesta.nextLine();

					boolean usuarioEncontrado = false;

					for (Usuario usuarios : ruizZayana.getListaUsuarios()) {
					    if (usuarios.getIdentificacion().equals(identificacionBuscar)) {
					        usuarioEncontrado = true;

					        if (usuarios.getListaPrestamo().isEmpty()) {
					            System.out.println("NO TIENES NINGUN LIBRO PRESTADO");
					        } else {
					            System.out.println("Libros Prestados: ");
					            int cont = 1;
					            for (Prestamo prestamoVer : usuarios.getListaPrestamo()) {
					                System.out.println(cont + ".: " + prestamoVer.getLibro().getTitulo());
					                cont++;
					            }

					            System.out.println("Nombre del libro que desea retornar:");
					            String libroRetornar = respuesta.nextLine();
					            for (Libro libros : ruizZayana.getListaLibros()) {
					                if (libroRetornar.equals(libros.getTitulo())) {
					                    Iterator<Prestamo> iterator = usuarios.getListaPrestamo().iterator();
					                    while (iterator.hasNext()) {
					                        Prestamo prestamo = iterator.next();
					                        if (libroRetornar.equals(prestamo.getLibro().getTitulo())) {
					                            iterator.remove();
					                            prestamo.getLibro().setDisponible(true);
					                            System.out.println("Libro retornado exitosamente!!!");
					                            break;
					                        }
					                    }
					                }
					            }

					            if (!usuarios.getListaPrestamo().isEmpty()) {
					                System.out.println("Ningun libro ha sido retornado");
					            }
					        }

					        break;
					    }
					}

					if (!usuarioEncontrado) {
					    System.out.println("Usuario no existente...");
					}
					break;
					
				case 6:
					System.out.println("GRACIAS POR TU VISITA, ESPERAMOS TU REGRESO");
					break;
			}
				if(opcion==6) {			
				break;
			}
			
		}
	}

}
