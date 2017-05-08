
public class Persona {
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String Email;
	private String Sexo;
	private int Edad;
	
	
	public Persona() {}
	public Persona(String nombre, String apellido1, String apellido2, String email, String sexo, int edad) {
		super();
		Nombre = nombre;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
		Email = email;
		Sexo = sexo;
		Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido1() {
		return Apellido1;
	}
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	public String getApellido2() {
		return Apellido2;
	}
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	@Override
	public String toString() {
		return "Datos de registro:\n"
				+ "Nombre=" + Nombre 
				+ "\nPrimer apellido=" + Apellido1 
				+ "\nSegundo apellido=" + Apellido2 
				+ "\nEmail="+ Email 
				+ "\nSexo=" + Sexo 
				+ "\nEdad=" + Edad;
	}
	


}
