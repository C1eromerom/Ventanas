package Biblioteca;
import java.io.*;

public class NodoEjemplar implements Serializable{
	private Ejemplar ejemplar;
	private NodoEjemplar siguiente;
	
	public NodoEjemplar(Ejemplar libro){
		this.ejemplar = libro;
		this.siguiente = null;
	}
	
	public NodoEjemplar(){
		ejemplar = null;
		siguiente = null;
	}

	public Ejemplar getEjemplar() {
		return ejemplar;
	}


	public void setEjemplar(Ejemplar libro) {
		this.ejemplar = libro;
	}

	public NodoEjemplar getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoEjemplar siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return ejemplar.toString();
	}
}
