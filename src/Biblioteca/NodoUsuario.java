package Biblioteca;
import java.io.*;

public class NodoUsuario implements Serializable{
	private Usuario user;
	private NodoUsuario siguiente;
	
	public NodoUsuario(Usuario user){
		this.user = user;
		this.siguiente = null;
	}
	
	public NodoUsuario(){
		this.user = null;
		siguiente = null;
	}

	public NodoUsuario getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoUsuario siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString(){
		return "Nombre: " + this.user;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	
}
