package Biblioteca;
import java.io.Serializable;

import javax.swing.JComboBox;

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
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			NodoUsuario aux = inicio;
			inicio = aux.getSiguiente();
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
	
	public NodoUsuario buscarPosicion(int posicion){
		if(posicion<0 || posicion>tamano-1) return null;
		else{
			NodoUsuario aux = inicio;
			if(posicion==0){
				return aux;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				return aux;
			}
			
		}
	}
	
	public boolean eliminarUsuario(String n){
		int posicion = 0;
		boolean encontrado = false;
		NodoUsuario aux2 = getInicio();
		while(aux2!=null & !encontrado){
			if(n==aux2.getUser().getNombre()){
				encontrado=true;
			}else{
				aux2 = aux2.getSiguiente();
				posicion++;
			}
		}
		
		if(posicion<0 || posicion>tamano-1)  return false;
		else{
			NodoUsuario aux = inicio;
			NodoUsuario aux3 = inicio;
			if(posicion==0){
				eliminarPrimero();
				return true;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
			
				}
				for(int i=0;i<posicion+1;i++){
					aux3 = aux3.getSiguiente();
			
				}
				aux.setSiguiente(aux3);
				tamano--;
				return true;
			}
			
		}
		
		
		}

}
