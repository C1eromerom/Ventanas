package Biblioteca;
import java.io.*;

public class NodoLibrosEnUsuario implements Serializable{
	private String titulo;
	private NodoLibrosEnUsuario siguiente;
	
	public NodoLibrosEnUsuario(String titulo){
		this.titulo = titulo;
		this.siguiente = null;
	}
	
	public NodoLibrosEnUsuario(){
		this.titulo = "";
		siguiente = null;
	}


	public NodoLibrosEnUsuario getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLibrosEnUsuario siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return "Nombre: " + this.titulo;
	}
}
