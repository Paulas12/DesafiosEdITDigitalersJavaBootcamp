package main;

import entidades.Impresora; 

public class Principal {

	public static void main(String[] args) throws Exception {
		
		try(Impresora impresora = new Impresora("HP")){
			impresora.imprimir();
			impresora.imprimir(new String[] { "Hola", "Mundo" });;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
