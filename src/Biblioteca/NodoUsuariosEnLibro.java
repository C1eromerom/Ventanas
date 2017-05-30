package Biblioteca;
import java.io.*;

public class NodoUsuariosEnLibro implements Serializable{
	private String nombre;
	private NodoUsuariosEnLibro siguiente;
	
	public NodoUsuariosEnLibro(String nombre){
		this.nombre = nombre;
		this.siguiente = null;
	}
	
	public NodoUsuariosEnLibro(){
		nombre = null;
		siguiente = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public NodoUsuariosEnLibro getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoUsuariosEnLibro siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return "Nombre: " + this.nombre;
	}
}
