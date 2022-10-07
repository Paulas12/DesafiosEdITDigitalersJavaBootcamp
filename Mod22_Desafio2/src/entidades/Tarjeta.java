package entidades;
import utilidades.Formatos;

public class Tarjeta extends Producto {
		private Integer codigoSeguridad;

		public Tarjeta() {
			setNumero(getNumeroGenerado());
		}

		public Tarjeta(Integer banco, Integer sucursal, Integer codigoSeguridad) {
			super(banco, sucursal);
			this.codigoSeguridad = codigoSeguridad;
			setNumero(getNumeroGenerado());
		}

		public String toString() {
			return "TarjetaCredito [Banco=" + Formatos.getFormato(getBanco(), "BANCO") + ", Sucursal="
					+ Formatos.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formatos.getFormato(getNumero(), "TC")
					+ ", Codigo de Seguridad=" + Formatos.getFormato(getCodigoSeguridad(), "CS") + "]";
		}

		public Integer getCodigoSeguridad() {
			return codigoSeguridad;
		}

		public void setCodigoSeguridad(Integer codigoSeguridad) {
			this.codigoSeguridad = codigoSeguridad;
		}


}
