package Biblioteca;

public class Libro {
	private String autor;
	private String titulo;
	private int ejemplares;
	private int prestados;
	private int ISBN;
	private ListaUsuariosEnLibro lista;
	
	public Libro(){
		this.autor = "";
		this.titulo = "";
		this.ISBN = 0;
		this.lista = new ListaUsuariosEnLibro();
	}

	public Libro(String autor, String titulo,int ejemplares){
		this.autor = autor;
		this.titulo = titulo;
		this.ejemplares = ejemplares;
		this.ISBN = (int)Math.random()*99999999+0;
		this.lista = new ListaUsuariosEnLibro();
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
	
	public boolean prestamo(Usuario user){
		if(this.prestados<this.ejemplares){
			lista.insertarFinal(new NodoUsuariosEnLibro(user.getNombre()));
			prestados++;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean devolucion(Usuario user){
		if(this.prestados>0){
			if(buscar(user.getNombre())!= (-1)){
				lista.eliminarPosicion(buscar(user.getNombre()));
			}else{
				
			}
			
			prestados--;
			return true;
		}else{
			return false;
		}
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
	
}



