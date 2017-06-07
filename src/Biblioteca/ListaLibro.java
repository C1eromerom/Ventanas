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
	
	
	
	
	public boolean eliminarPrimero(){
		if(inicio==null) return false;
		else{
			NodoLibro aux = inicio;
			inicio = aux.getSiguiente();
			tamano--;
			return true;
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
	
	public NodoLibro buscarLibro(String n){
		int posicion = 0;
		boolean encontrado = false;
		
		NodoLibro aux2 = getInicio();
		while(aux2!=null & !encontrado){
			if(n==aux2.getLibro().getTitulo()){
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

}
