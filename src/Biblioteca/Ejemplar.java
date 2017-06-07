package Biblioteca;


public class Ejemplar {
	private boolean prestado;
	private String titulo;
	private int ejemplar;
	private Usuario usuario;

	
	public Ejemplar(){
		this.titulo = "";
		this.prestado= false;
		
	}

	public Ejemplar(String titulo,int ejemplar,boolean prestado, Usuario usuario){
		this.titulo = titulo;
		this.ejemplar=ejemplar;
		this.prestado=prestado;
		this.usuario=usuario;
	}
	
	public Ejemplar(String titulo,int ejemplar,boolean prestado){
		this.titulo = titulo;
		this.ejemplar=ejemplar;
		this.prestado=prestado;
		this.usuario=null;
	}
	


	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestados) {
		this.prestado = prestados;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}



