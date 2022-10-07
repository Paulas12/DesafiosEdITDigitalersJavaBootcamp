package entidades;

import java.io.IOException;
import java.util.Arrays;

public class Impresora{
	public static String[] Impresoras_Disponibles = { "Canon", "HP", "Epson", "Brother", "Samsung" };
	public String impresora;
	private String[] documento;
	

	public Impresora(String impresora) throws Exception {
		super();
		setImpresora(impresora);
	}

	public Impresora(String impresora, String[] documento) throws Exception {
		super();
		this.documento = documento;
		setImpresora(impresora);
	}

	public void imprimir() throws IOException {
		if (documento == null) {
			throw new IOException("El documento a imprimir debe contener datos");
		} else {
			for (String linea : documento) {
				System.out.println(linea);
			}
		}

	}

	public void imprimir(String[] documento) throws IOException {
		if (documento == null) {
			throw new IOException("El documento a imprimir debe contener datos");
		} else {
			for (String linea : documento) {
				System.out.println(linea);
			}
		}

	}

	public String toString() {
		return "Impresora [impresora=" + impresora + ", documento=" + Arrays.toString(documento) + "]";
	}

	public String getImpresora() {
		return impresora;
	}

	public void setImpresora(String impresora) throws Exception {
		boolean existeImpresora = false;
		if (impresora != null) {
			for (String impresoraDisponible : Impresoras_Disponibles) {
				if (impresora.equalsIgnoreCase(impresoraDisponible)) {
					existeImpresora = true;
					break;
				}
			}
		}

		if (!existeImpresora) {
			throw new Exception("Se permiten solo las siguientes impresoras " + Arrays.toString(Impresoras_Disponibles));
		}

		this.impresora = impresora;
	}

	public String[] getDocumento() {
		return documento;
	}

	public void setDocumento(String[] documento) {
		this.documento = documento;
	}


	public void close() throws Exception {
		System.out.println("Fin de la conexion con la impresora " + impresora);
	}

}
