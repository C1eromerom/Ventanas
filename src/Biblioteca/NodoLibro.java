package Biblioteca;
import java.io.*;

public class NodoLibro implements Serializable{
	private Libro libro;
	private NodoLibro siguiente;
	
	public NodoLibro(Libro libro){
		this.libro = libro;
		this.siguiente = null;
	}
	
	public NodoLibro(){
		libro = null;
		siguiente = null;
	}

	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public NodoLibro getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLibro siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return libro.toString();
	}
}
