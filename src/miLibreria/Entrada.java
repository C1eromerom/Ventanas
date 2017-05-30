package miLibreria;
import java.util.Scanner; 

public class Entrada {
	Scanner leer = new Scanner(System.in);
	
	public int obtenerEntero(String msg){
		boolean error = true;
		String teclado = "";
		int num = 0;
		do{
			try{
				System.out.println(msg);
				teclado = leer.nextLine();
				num = Integer.parseInt(teclado);
				error = false;
			}catch(Exception e){
				System.out.println("Debes introducir un número entero.");
				leer.next();
			}
		}while(error);
	return num;
	}
	
	public float obtenerFloat(String msg){
		boolean error = true;
		float num = 0;
		
		do{
			try{
				System.out.println(msg);
				num = leer.nextFloat();
				
				error = false;
			}catch(Exception e){
				System.out.println("Debes introducir un float.");
				leer.next();
			}
		}while(error);
	return num;
	}
	
	public String obtenerString(String msg){
		boolean error = true;
		String cadena = "";
		
		do{
			try{
				System.out.println(msg);
				cadena = leer.nextLine();
				error = false;
			}catch(Exception e){
				System.out.println("Debes introducir un String.");
				leer.next();
			}
		}while(error);
	return cadena;
	}
	
	public char obtenerChar(String msg){
		boolean error = true;
		char caracter = 0;
		
		do{
			try{
				System.out.println(msg);
				caracter = leer.next().charAt(0);
				
				error = false;
			}catch(Exception e){
				System.out.println("Debes introducir un carácter.");
				leer.next();
			}
		}while(error);
	return caracter;
	}
}
