import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//2.1
		float num1, num2;
		int dec;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = teclado.nextFloat();
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = teclado.nextFloat();
		
		System.out.println("Ingrese la cantidad de decimales: ");
		dec = teclado.nextInt();
		
		//2.2
		double resultado;
		
		resultado = Math.pow(num1, num2);
		System.out.println(String.format( "Potencia de los nros ingresados:" + " %." + dec + "f ", resultado));
	

	}

}
