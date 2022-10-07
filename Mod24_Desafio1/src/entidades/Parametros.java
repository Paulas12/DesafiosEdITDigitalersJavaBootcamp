package entidades;

import java.util.Objects; 

public class Parametros<k,v> implements Comparable<k> {
	private k clave;
	private k valor;
	
	public Parametros() {
		super();
		
	}

	public Parametros(k clave, k valor) {
		super();
		clave = clave;
		valor = valor;
	}

	public Parametros(int i, String string) {
	
	}

	public k getClave() {
		return clave;
	}

	public void setClave(k clave) {
		clave = clave;
	}

	public k getValor() {
		return valor;
	}

	public void setValor(k valor) {
		valor = valor;
	}
	
	public int hashCode() {
		return Objects.hash(clave);
	}

	public String toString() {
		return "Parametros [clave=" + clave + ", valor=" + valor + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parametros other = (Parametros) obj;
		return Objects.equals(clave, other.clave);
	}

	
	public int compareTo(k clave) {
		if (this.clave instanceof Integer && clave instanceof Parametros) {
			Parametros aux = (Parametros) clave;
			if (aux.clave instanceof Integer) {
				Integer aux1 = (Integer) this.clave;
				Integer aux2 = (Integer) aux.clave;

				return aux1 - aux2;
			}

		}
		return 0;
	}	
}
