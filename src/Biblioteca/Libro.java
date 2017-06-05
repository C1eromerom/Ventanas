package Biblioteca;


public class Libro {
	private String autor;
	private String titulo;
	private ListaLibro listaejemplares;
	private boolean prestados;
	private String ISBN;
	private int ejemplares;
	private ListaUsuariosEnLibro lista;
	private Usuario usuario;
	private int ejemplar;
	
	public Libro(){
		this.autor = "";
		this.titulo = "";
		this.ISBN = "";
		this.lista = new ListaUsuariosEnLibro();
	}

	public Libro(String autor, String titulo){
		this.autor = autor;
		this.titulo = titulo;
		this.listaejemplares = null;
		this.ISBN = null;
		this.ejemplares=0;
		this.lista = new ListaUsuariosEnLibro();
	}
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Libro(String autor, String titulo,int ejemplares, String ISBN,boolean prestados){
		this.autor = autor;
		this.titulo = titulo;
		this.ejemplares = ejemplares;
		this.ISBN = ISBN;
		this.prestados=prestados;
		this.lista = new ListaUsuariosEnLibro();
		llenarSubLista();
	}
	
	public Libro(String autor, String titulo,int ejemplar, String ISBN){
		this.autor = autor;
		this.titulo = titulo;
		this.ejemplar = ejemplar;
		this.ISBN = ISBN;
	}
	
	public ListaLibro getEjemplares() {
		return listaejemplares;
	}

	public void setEjemplares(ListaLibro listaejemplares) {
		this.listaejemplares = listaejemplares;
	}

	public boolean getPrestados() {
		return prestados;
	}

	public void setPrestados(boolean prestados) {
		this.prestados = prestados;
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
	
	public int buscar(String n){
		int posicion = 0;
		boolean encontrado = false;
		ListaUsuariosEnLibro aux = this.lista;
		NodoUsuariosEnLibro aux2 = aux.getInicio();
		while(aux2!=null & !encontrado){
			if(n==aux2.getNombre()){
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
	
	public boolean prestamo(Usuario user,Libro libro){
		boolean bucle=false;
		boolean prestado=false;
		int posicion = 0;
		if(listaejemplares.getTamano()>0){
			while(bucle=false){
			if(listaejemplares.getPosicion(posicion)==null){
				prestado= false;
			}else if(listaejemplares.getPosicion(posicion).getLibro().getPrestados()==true){
				posicion++;
			} else {
				listaejemplares.getPosicion(posicion).getLibro().setPrestados(true);
				listaejemplares.getPosicion(posicion).getLibro().setUsuario(user);
				bucle=true;
			}
			prestado= true;
			}
		}else{
			prestado= false;
		}
		return prestado;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean devolucion(Usuario user, Libro libro){	
		boolean bucle=false;
		boolean devuelto=false;
		int posicion = 0;
		if(listaejemplares.getTamano()>0){
			while(bucle=false){
			if(listaejemplares.getPosicion(posicion)==null){
				devuelto= false;
			}else if(listaejemplares.getPosicion(posicion).getLibro().getPrestados()==true && listaejemplares.getPosicion(posicion).getLibro().getUsuario()==user){
				listaejemplares.getPosicion(posicion).getLibro().setPrestados(false);
				listaejemplares.getPosicion(posicion).getLibro().setUsuario(null);
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
		if(listaejemplares.getTamano()>0){
			while(bucle=false){
			if(listaejemplares.getPosicion(posicion)==null){
				bucle= true;
			}else if(listaejemplares.getPosicion(posicion).getLibro().getPrestados()==true){
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
		NodoUsuariosEnLibro aux = lista.getInicio();
		String nombre = "";
		while(aux!=null){
			nombre = nombre + ", " + aux.getNombre();
			aux = aux.getSiguiente();
		}
		return "Autor: \t\t\t" + autor + "\n" +
				"Titulo: \t\t" + titulo + "\n" +
				"Ejemplares: \t\t" + ejemplares + "\n" +
				"Ejemplares prestados: \t" + prestados + "\n" + 
				"Usuarios que tienen este libro: " + nombre;
	}
	
	public void llenarSubLista(){
		for(int i=1;i<=ejemplares;i++){
			listaejemplares.insertarFinal(new NodoLibro(new Libro(titulo,autor,ejemplar,ISBN,false)));
		}
	}
	
}



