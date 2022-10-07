package main;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import entidades.Parametros;

public class Telefono {
	public static void main(String[] args) {
		Set<Parametros<Integer, String>> telefonos = new TreeSet<>();
		telefonos.add(new Parametros<Integer, String>(34, "España"));
		telefonos.add(new Parametros<Integer, String>(52, "Mexico"));
		telefonos.add(new Parametros<Integer, String>(54, "Argentina"));
		telefonos.add(new Parametros<Integer, String>(55, "Brasil"));
		telefonos.add(new Parametros<Integer, String>(56, "Chile"));
		telefonos.add(new Parametros<Integer, String>(57, "Colombia"));
		telefonos.add(new Parametros<Integer, String>(58, "Venezuela"));
		
		System.out.println();
		System.out.println("Listado de documentos:");

		Iterator<Parametros<Integer, String>> iterador = telefonos.iterator();

		while (iterador.hasNext()) {
			Parametros<Integer, String> telefono = iterador.next();
			System.out.println(telefono);
		}

	}

}
