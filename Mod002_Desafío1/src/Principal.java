import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ingreso de nombre y apellido 
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese nombre y apellido: ");
		String nombreComp =  teclado.nextLine();
		
		teclado.close();
		
		System.out.println("Separacion de nombre y apellido: ");
		int espacio = nombreComp.indexOf(" ");
		
		String nombre = nombreComp.substring(0, espacio);
		String apellido = nombreComp.substring(espacio + 1);
		
		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println(" ");
		
		System.out.println("Iniciales en mayusculas: ");
		String primerLetraNombre = nombre.substring(0, 1).toUpperCase();
		String restoDeLetrasNombre = nombre.substring(1).toLowerCase();
		System.out.println("Primera letra del nombre en mayuscula: " + primerLetraNombre + restoDeLetrasNombre);
			
		String primerLetraApellido = apellido.substring(0, 1).toUpperCase();
		String restoDeLetrasApellido = apellido.substring(1).toLowerCase();
		System.out.println("Primera letra del apellido en mayuscula: " + primerLetraApellido + restoDeLetrasApellido);
	
	}

}
