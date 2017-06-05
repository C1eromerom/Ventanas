package Biblioteca;
import java.io.Serializable;

public class ListaLibro implements Serializable{
	private NodoLibro inicio;
	private int tamano;
	
	public ListaLibro(){
		inicio = null;
		tamano = 0;
	}
	
	public NodoLibro getInicio(){
		return inicio;
	}
	
	public int getTamano(){
		return tamano;
	}
	
	public NodoLibro getPosicion(int posicion){

		if(posicion<0 || posicion>tamano) return null;
		else{
			NodoLibro aux = inicio;
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
	
	public void setInicio(NodoLibro inicio){
		this.inicio = inicio;
	}
	
	public void setTamano(int tamano){
		this.tamano = tamano;
	}
	
	public String toString(){
		String salida = "";
		NodoLibro auxiliar = inicio;
		
		while(auxiliar!=null){
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nHay " + tamano + " libros";
		return salida;
	}
	
	public String mostrarTitulos(){
		String salida = "";
		NodoLibro auxiliar = inicio;
		int contador = 0;
		
		while(auxiliar!=null){
			salida = salida + contador+ "- " + auxiliar.getLibro().getTitulo() + "\n";
			auxiliar = auxiliar.getSiguiente();
			contador++;
		}
		return salida;
	}
	
	public void insertarInicio(NodoLibro nodo){
		nodo.setSiguiente(inicio);
		inicio = nodo;
		tamano++;
	}
	
	public void insertarFinal(NodoLibro nodo){
		if(inicio == null) insertarInicio(nodo);
		else{
			NodoLibro aux = inicio;
			while(aux.getSiguiente()!=null){
				aux = aux.getSiguiente();
			
			}
			aux.setSiguiente(nodo);
			tamano++;
		}
	}
	
	
	public boolean insertarPosicion(int posicion,NodoLibro nodo){
		if(posicion<0 || posicion>tamano) return false;
		else{
			NodoLibro aux = inicio;
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
			NodoLibro aux = inicio;
			inicio = aux.getSiguiente();
			tamano--;
			return true;
		}
	}
	
	public NodoLibro eliminarUltimo(){
		int i = 0;
		if(inicio==null) return null;
		else{
			NodoLibro aux = inicio;
			while(i<tamano-2){
				aux=aux.getSiguiente();
				i++;
			}
			NodoLibro aux2 =aux.getSiguiente();
			aux.setSiguiente(null);
			tamano--;
			return aux2;
		}
	}
	
	public boolean eliminarPosicion(int posicion){
		if(posicion<0 || posicion>tamano-1)  return false;
		else{
			NodoLibro aux = inicio;
			NodoLibro aux2 = inicio;
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
