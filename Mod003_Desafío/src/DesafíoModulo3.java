
public class DesafíoModulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DESAFIO
		
		//Ejercicio 1
		int nro1 = 100, nro2 = 500, nro3 =250; 
		
		if (nro1 > nro2) {   	
			if(nro1 > nro3)    
				System.out.println("nro1 es el mayor" + nro1);
			else
				System.out.println("nro3 es el mayor" + nro3);
		}else {
			if(nro2 > nro3)
				System.out.println("nro2 es el mayor " + nro2);
			else 
				System.out.println("nro3 es el mayor " + nro3);
		}
		//Ejercicio 2
		int a=10, b=-2, c=5, res; 
		
		if (a > 0) {		
			if (b>0)		
				res = a*b;
			else 
				res = a*c;	
		}else {
			res = b*c;
		System.out.println("Resultado:" + res);
		}
		
		
		//Ejercicio 3
		
		String usuario= "Pepito", clave= "1234"; 
		
		if (usuario.equals ("Pepito")) {				
			if(clave.equals("1234"))
				System.out.println("Bienvenido pepito!");
			else 
				System.out.println("Contraseña incorrecta");
		}else {
			System.out.println("Usuario incorrecto");
		}


	}

}
