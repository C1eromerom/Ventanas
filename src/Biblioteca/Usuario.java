package Biblioteca;

public class Usuario {
	private String nombre;
	private String DNI;
	private ListaLibrosEnUsuario lista;
	
	public Usuario(String nombre, String DNI){
		this.nombre = nombre;
		this.DNI = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ListaLibrosEnUsuario getLista() {
		return lista;
	}

	public void setLista(ListaLibrosEnUsuario lista) {
		this.lista = lista;
	}
	
	public void insertarLibro(Libro l){
		
	}
	
	public void verLibros(){
		
	}

}
