package Biblioteca;
import java.io.Serializable;

public class ListaLibrosEnUsuario implements Serializable{
	private NodoLibrosEnUsuario inicio;
	private int tamano;
	
	public ListaLibrosEnUsuario(){
		inicio = null;
		tamano = 0;
	}
	
	public NodoLibrosEnUsuario getInicio(){
		return inicio;
	}
	
	public int getTamano(){
		return tamano;
	}
	
	public void setInicio(NodoLibrosEnUsuario inicio){
		this.inicio = inicio;
	}
	
	public void setTamano(int tamano){
		this.tamano = tamano;
	}
	
	public String toString(){
		String salida = "La lista contiene: ";
		NodoLibrosEnUsuario auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa lista tiene " + tamano + " elementos";
		return salida;
	}
	
	public void insertarInicio(NodoLibrosEnUsuario nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tamano++;
	}
	
	public void insertarFinal(NodoLibrosEnUsuario nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoLibrosEnUsuario aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamano++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,NodoLibrosEnUsuario nodo){
		if(posicion<0 || posicion>tamano) return false;
		else{
			NodoLibrosEnUsuario aux = inicio;
			if(posicion==0){
				insertarInicio(nodo);
				return true;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				nodo.setSiguiente(aux.getSiguiente());
				aux.setSiguiente(nodo);
				tamano++;
				return true;
			}
			
		}
	}
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			NodoLibrosEnUsuario aux = inicio;
			inicio = aux.getSiguiente();
			tamano--;
			return true;
		}
	}
	
	public boolean eliminarUltimo(){
		int i = 0;
		if(inicio==null) return false;
		else{
			NodoLibrosEnUsuario aux = inicio;
			while(i<tamano-2){
				aux=aux.getSiguiente();
				i++;
			}
			aux.setSiguiente(null);
			tamano--;
			return true;
		}
	}
	
	public boolean eliminarPosicion(int posicion){
		if(posicion<0 || posicion>tamano) return false;
		else{
			NodoLibrosEnUsuario aux = inicio;
			NodoLibrosEnUsuario aux2 = inicio;
			if(posicion==0){
				eliminarPrimero();
				return true;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				for(int i=0;i<posicion+1;i++){
					aux2 = aux2.getSiguiente();
			
				}
				aux.setSiguiente(aux2);
				tamano--;
				return true;
			}
			
		}
	}

}
