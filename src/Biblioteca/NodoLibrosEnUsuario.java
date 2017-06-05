package Biblioteca;
import java.io.*;

public class NodoLibrosEnUsuario implements Serializable{
	private Libro libro;
	private NodoLibrosEnUsuario siguiente;
	
	public NodoLibrosEnUsuario(Libro titulo){
		this.libro = titulo;
		this.siguiente = null;
	}
	
	public NodoLibrosEnUsuario(){
		this.libro = null;
		siguiente = null;
	}


	public NodoLibrosEnUsuario getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLibrosEnUsuario siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return "Nombre: " + this.libro;
	}
}
