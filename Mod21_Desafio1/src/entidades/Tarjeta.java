package entidades;
import utilidades.Formato;

public class Tarjeta extends Producto{
	private Integer codigoSeguridad;

	public Tarjeta() {
		generarNumeroProducto();
	}

	public Tarjeta(Integer banco, Integer sucursal, Integer codigoSeguridad) {
		super(banco, sucursal);
		this.codigoSeguridad = codigoSeguridad;
		generarNumeroProducto();
	}

	@Override
	public String toString() {
		return "TarjetaCredito [Banco=" + Formato.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formato.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formato.getFormato(getNumero(), "TC")
				+ ", Codigo de Seguridad=" + Formato.getFormato(getCodigoSeguridad(), "CS") + "]";
	}

	public Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	private void generarNumeroProducto() {
		Integer numero = numeroTC++;
		setNumero(numero);

	}
}
