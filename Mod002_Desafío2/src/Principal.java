import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Ingrese el segundo numero: ");
		double num2 = teclado.nextDouble();
		
		double resultado;
		resultado = num1 + num2;
		System.out.println(String.format("La suma con decimales: %.2f ", resultado));
		System.out.println("La suma sin decimales: " + ((int) resultado));
	}

}
