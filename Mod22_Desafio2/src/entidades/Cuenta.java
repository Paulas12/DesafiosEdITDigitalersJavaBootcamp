package entidades;
import utilidades.Formatos;

public class Cuenta extends Producto {
	private String tipo;

		public Cuenta() {
			setNumero(getNumeroGenerado());
		}

		public Cuenta(Integer banco, Integer sucursal, String tipo) {
			super(banco, sucursal);
			this.tipo = tipo;
			setNumero(getNumeroGenerado());

		}

		public String toString() {
			return "Cuenta [Banco=" + Formatos.getFormato(getBanco(), "BANCO") + ", Sucursal="
					+ Formatos.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formatos.getFormato(getNumero(), tipo)
					+ ", Tipo=" + tipo + "]";
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

}
