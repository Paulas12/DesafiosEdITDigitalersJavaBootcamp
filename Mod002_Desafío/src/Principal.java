import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 1
		Scanner entrada = new Scanner(System.in);
		String NombreCompleto; 
		
		System.out.println("Ingrese su primer nombre y primer apellido: ");
		NombreCompleto = entrada.nextLine(); 
		
		//1.
		System.out.println();
		System.out.println("Nombre por separado:");
		
		
		
		//2.
		System.out.println();
		System.out.println("Primera letra en Mayusculas:");

		String NombreCompletoPrimeraLetraMayuscula = (NombreCompleto.substring(0, 1).toUpperCase()+ (NombreCompleto.substring(0,1).toUpperCase())) ;
		System.out.println(NombreCompletoPrimeraLetraMayuscula);
		

        

	}

}
