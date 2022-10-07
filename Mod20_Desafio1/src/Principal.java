import java.util.Scanner;
import credenciales.Usuario; 
import java.util.Arrays; 

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		do {
			System.out.println("Ingrese correo: ");
			usuario.setCorreo(entrada.nextLine());
			System.out.println("Ingrese la clave: ");
			usuario.setContraseña(entrada.nextLine());
		} while (!usuario.esUsuarioValido());
			
		
		entrada.close();
	}
	
}
