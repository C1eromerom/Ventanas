package Biblioteca;



public class Usuario {
	private String nombre;
	private String DNI;
	private ListaEjemplares lista;
	
	public Usuario(String nombre, String DNI){
		this.nombre = nombre;
		this.DNI = DNI;
		this.lista = new ListaEjemplares();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ListaEjemplares getLista() {
		return lista;
	}

	public void setLista(ListaEjemplares lista) {
		this.lista = lista;
	}
	
	public void insertarLibro( Ejemplar l){
		lista.insertarFinal(new NodoEjemplar(l));
	}
	
	public void verLibros(){
		
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

}
