package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

import entidades.Parametros;

public class Documento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Set<Parametros<String, String>> documentos = new HashSet<>();

		while (true) {

			System.out.print("Indique el tipo de documento: ");
			String tipo = entrada.next().toUpperCase();
			System.out.print("Indique la descripcion del " + tipo + " : ");
			String descripcion = entrada.next();

			Parametros<String, String> documento = new Parametros<>(tipo, descripcion);
			boolean documentoAgregado = documentos.add(documento);

			System.out.println((documentoAgregado ? "Se" : "No se") + " agrego el documento: " + documento);

			System.out.print("¿desea agregar mas documentos? (si/no): ");
			String continuar = entrada.next();
			if (continuar.equalsIgnoreCase("no")) {
				break;
			}

		}

		System.out.println();
		System.out.println("Lista de Documentos:");

		Iterator<Parametros<String, String>> iterador = documentos.iterator();

		while (iterador.hasNext()) {
			Parametros<String, String> documento = iterador.next();
			System.out.println(documento);
		}

		entrada.close();

	}
}
