import java.util.Arrays;
import java.util.Scanner; 

public class Principal {

	public static void main(String[] args) {
		Scanner ingreso_teclado= new Scanner(System.in);
		int [] aleatorios;
		int cant_nros; 
		
		System.out.print("Ingrese la cantidad de numeros aleatorios a generar:");
		cant_nros = ingreso_teclado.nextInt();
		
		aleatorios = new int[cant_nros];
		
		//generando los numeros aleatorios
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int) ((Math.random() * cant_nros) + 1);
		}
		System.out.println(Arrays.toString(aleatorios));
		
		
		//divisibles
		for(int i=0; i< aleatorios.length; i++) {
			int numero = aleatorios [i]; 
			boolean divisiblex3 = numero % 3 == 0;
			boolean divisiblex5 = numero % 5 == 0;
			String resultado = ""; 

			if (divisiblex3) {
				resultado += "Fizz";
			}

			if (divisiblex5) {
				resultado += "Buzz";
			}
			
			if (!divisiblex5 && !divisiblex3) {
				resultado += "FizzBuzz";
			}

			System.out.println(resultado + "\n " + numero);

		}
	}

}
