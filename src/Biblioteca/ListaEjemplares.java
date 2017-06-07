package Biblioteca;
import java.io.Serializable;

import javax.swing.JComboBox;

public class ListaEjemplares implements Serializable{
	private NodoEjemplar inicio;
	private int tamano;
	
	public ListaEjemplares(){
		inicio = null;
		tamano = 0;
	}
	
	public NodoEjemplar getInicio(){
		return inicio;
	}
	
	public int getTamano(){
		return tamano;
	}
	
	public NodoEjemplar getPosicion(int posicion){

		if(posicion<0 || posicion>tamano) return null;
		else{
			NodoEjemplar aux = inicio;
			if(posicion==0){

				return inicio;
			}else{
				for(int i=0;i<posicion-1;i++){
					aux = aux.getSiguiente();
				}
			}
			return aux;
		}
			
	}
	
	public void setInicio(NodoEjemplar inicio){
		this.inicio = inicio;
	}
	
	public void setTamano(int tamano){
		this.tamano = tamano;
	}
	
	public String toString(){
		String salida = "";
		NodoEjemplar auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nHay " + tamano + " libros";
		return salida;
	}
	
	public String mostrarTitulos(){
		String salida = "";
		NodoEjemplar auxiliar = inicio;
		int contador = 0;
		
		while(auxiliar!=null){
			salida = salida + contador+ "- " + auxiliar.getEjemplar().getTitulo() ;
			if(auxiliar.getEjemplar().getUsuario()!=null) {
				salida = salida + " || "+auxiliar.getEjemplar().getUsuario().getNombre()+"\n";
			}else {
				salida = salida + "\n";
			}
			auxiliar = auxiliar.getSiguiente();
			contador++;
		}
		return salida;
	}
	
	public void insertarInicio(NodoEjemplar nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tamano++;
	}
	
	public void insertarFinal(NodoEjemplar nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoEjemplar aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamano++;
		}
	}
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			NodoEjemplar aux = inicio;
			inicio = aux.getSiguiente();
			tamano--;
			return true;
		}
	}
	
	
	public boolean eliminarPosicion(int posicion){
		if(posicion<0 || posicion>tamano-1)  return false;
		else{
			NodoEjemplar aux = inicio;
			NodoEjemplar aux2 = inicio;
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
	
	public boolean eliminarEjemplar(String n){
		int posicion = 0;
		boolean encontrado = false;
		NodoEjemplar aux2 = getInicio();
		while(aux2!=null & !encontrado){
			if(n==aux2.getEjemplar().getUsuario().getNombre()){
				encontrado=true;
			}else{
				aux2 = aux2.getSiguiente();
				posicion++;
			}
		}
		
		if(posicion<0 || posicion>tamano-1)  return false;
		else{
			NodoEjemplar aux = inicio;
			NodoEjemplar aux3 = inicio;
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

	
	public NodoEjemplar buscarEjemplar(String n){
		int posicion = 0;
		boolean encontrado = false;
		
		NodoEjemplar aux2 = getInicio();
		while(aux2!=null & !encontrado){
			if(n==aux2.getEjemplar().getTitulo()){
				encontrado=true;
				return aux2;
			}else{
				aux2 = aux2.getSiguiente();
			}
		}
		if(encontrado) {
			return aux2;
	}else {
			return null;
		}
	}
	
	public NodoEjemplar buscarUsuario(String n){
		int posicion = 0;
		boolean encontrado = false;
		NodoEjemplar aux2 = getInicio();
		while(aux2!=null & !encontrado){
			if(n==aux2.getEjemplar().getUsuario().getNombre()){
				encontrado=true;
				return aux2;
			}else{
				aux2 = aux2.getSiguiente();
				posicion++;
			}
		}
		if(encontrado)
			return aux2;
		else
			return null;
	}


}
