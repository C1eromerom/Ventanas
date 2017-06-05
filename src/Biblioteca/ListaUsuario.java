package Biblioteca;
import java.io.Serializable;

public class ListaUsuario implements Serializable{
	private NodoUsuario inicio;
	private int tamano;
	
	public ListaUsuario(){
		inicio = null;
		tamano = 0;
	}
	
	public NodoUsuario getInicio(){
		return inicio;
	}
	
	public int getTamano(){
		return tamano;
	}
	
	public void setInicio(NodoUsuario inicio){
		this.inicio = inicio;
	}
	
	public void setTamano(int tamano){
		this.tamano = tamano;
	}
	
	public String toString(){
		String salida = "La lista contiene: ";
		NodoUsuario auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa lista tiene " + tamano + " elementos";
		return salida;
	}
	
	public String mostrarNombres(){
		String salida = "";
		NodoUsuario auxiliar = inicio;
		int contador = 0;
		
		while(auxiliar!=null){
			salida = salida + contador + "- " + auxiliar.getUser().getNombre() + "\n";
			auxiliar = auxiliar.getSiguiente();
			contador++;
		}
		return salida;
	}
	
	public void insertarInicio(NodoUsuario nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tamano++;
	}
	
	public void insertarFinal(NodoUsuario nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoUsuario aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamano++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,NodoUsuario nodo){
		if(posicion<0 || posicion>tamano) return false;
		else{
			NodoUsuario aux = inicio;
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
			NodoUsuario aux = inicio;
			inicio = aux.getSiguiente();
			tamano--;
			return true;
		}
	}
	
	public boolean eliminarUltimo(){
		int i = 0;
		if(inicio==null) return false;
		else{
			NodoUsuario aux = inicio;
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
		if(posicion<0 || posicion>tamano-1) return false;
		else{
			NodoUsuario aux = inicio;
			NodoUsuario aux2 = inicio;
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
