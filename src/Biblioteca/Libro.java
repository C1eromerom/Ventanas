package Biblioteca;


public class Libro {
	private String autor;
	private String titulo;
	private ListaEjemplares listaEjemplares;
	private String ISBN;
	private int ejemplares;
	private int prestados;
	
	public Libro(){
		this.autor = "";
		this.titulo = "";
		this.ISBN = "";
		this.listaEjemplares = new ListaEjemplares();
	}

	public Libro(String autor, String titulo){
		this.autor = autor;
		this.titulo = titulo;
		this.listaEjemplares = null;
		this.ISBN = null;
		this.ejemplares=0;
	}
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Libro(String autor, String titulo,int ejemplares, String ISBN){
		this.autor = autor;
		this.titulo = titulo;
		this.ejemplares = ejemplares;
		this.prestados=0;
		this.ISBN = ISBN;
		this.listaEjemplares = new ListaEjemplares();
		llenarSubLista();
	}
	
	
	public ListaEjemplares getListaEjemplares() {
		return listaEjemplares;
	}

	public void setListaEjemplares(ListaEjemplares listaejemplares) {
		this.listaEjemplares = listaejemplares;
	}

	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int buscarUsuario(String n){
		int posicion = 0;
		boolean encontrado = false;
		ListaEjemplares aux = this.listaEjemplares;
		NodoEjemplar aux2 = aux.getInicio();
		while(aux2!=null & !encontrado){
			if(n==aux2.getEjemplar().getUsuario().getNombre()){
				encontrado=true;
				return posicion;
			}else{
				aux2 = aux2.getSiguiente();
				posicion++;
			}
		}
		if(encontrado)
			return posicion;
		else
			return -1;
	}
	
	public void prestamo(Usuario user){
		boolean bucle=true;
		int posicion = 0;
		if(listaEjemplares.getTamano()>0){
			while(bucle=true){
			if(listaEjemplares.getPosicion(posicion)==null){
				bucle= false;
			}else if(listaEjemplares.getPosicion(posicion).getEjemplar().getPrestado()==true){
				posicion++;
			} else {
				listaEjemplares.getPosicion(posicion).getEjemplar().setPrestado(true);
				listaEjemplares.getPosicion(posicion).getEjemplar().setUsuario(user);
				prestados++;
				bucle=false;
			}
			}
		}

	}
	

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}
	
	public void setPrestados1(int prestados) {
		this.prestados = this.prestados+prestados;
	}
	public void setPrestados2(int prestados) {
		this.prestados = this.prestados-prestados;
	}

	public boolean devolucion(Usuario user, Libro libro){	
		boolean bucle=false;
		boolean devuelto=false;
		int posicion = 0;
		if(listaEjemplares.getTamano()>0){
			while(bucle=false){
			if(listaEjemplares.getPosicion(posicion)==null){
				devuelto= false;
			}else if(listaEjemplares.getPosicion(posicion).getEjemplar().getPrestado()==true && listaEjemplares.getPosicion(posicion).getEjemplar().getUsuario()==user){
				listaEjemplares.getPosicion(posicion).getEjemplar().setPrestado(false);
				listaEjemplares.getPosicion(posicion).getEjemplar().setUsuario(null);
				prestados--;
				bucle=true;
			} else {
				posicion++;
			}
			devuelto= true;
			}
		}else{
			devuelto= false;
		}
		return devuelto;
	}
	
	public int prestados(){	
		boolean bucle=false;
		int posicion = 0,prestados=0;
		if(listaEjemplares.getTamano()>0){
			while(bucle=false){
			if(listaEjemplares.getPosicion(posicion)==null){
				bucle= true;
			}else if(listaEjemplares.getPosicion(posicion).getEjemplar().getPrestado()==true){
				prestados++;
				posicion++;
			} else {
				posicion++;
			}
			}
		}
		
		return prestados;
	}
	
	public String toString(){
		
		return "Autor: \t\t\t" + autor + "\n" +
				"Titulo: \t\t" + titulo + "\n" +
				"Ejemplares: \t\t" + ejemplares + "\n" +
				"Ejemplares prestados: \t" + prestados() + "\n";
	}
	
	public void llenarSubLista(){
		for(int i=1;i<=ejemplares;i++){
			listaEjemplares.insertarFinal(new NodoEjemplar(new Ejemplar(titulo,i,false)));
		}
	}
	
}



