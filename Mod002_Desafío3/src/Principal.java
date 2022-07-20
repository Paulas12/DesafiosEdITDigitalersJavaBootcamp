import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char caracter1, caracter2;
		int ascii1, ascii2;
	
		
		System.out.println("Ingrese la primer letra: ");
		String letra1 =  teclado.next();
		
		System.out.println("Ingrese la segunda letra: ");
		String letra2 =  teclado.next();
		
		ascii1 = letra1.toLowerCase().charAt(0);
	
		ascii2 = letra2.toLowerCase().charAt(0);
		
		
		//Letras en mayuscula
		System.out.println("Primer letra en mayuscula: " + letra1.toUpperCase() + ascii1);
		System.out.println("Primer letra en mayuscula: " + letra2.toUpperCase() + ascii2);
		
				
		//Letras en minuscula
		System.out.println("Primer letra en minuscula: " + letra1.toLowerCase() + ascii1);
		System.out.println("Primer letra en minuscula: " + letra2.toLowerCase() + ascii2);
		

		

	}

}
