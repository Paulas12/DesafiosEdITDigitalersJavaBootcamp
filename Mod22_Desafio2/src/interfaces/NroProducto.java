package interfaces;
import entidades.Cuenta;
import entidades.Producto;
import entidades.Tarjeta;

public interface NroProducto {
		default Integer getNumeroGenerado() {

			if (this.getClass() == Cuenta.class) {
				Cuenta cuenta = (Cuenta) this;
				switch (cuenta.getTipo().toUpperCase()) {
				case "CC":
					return Producto.NUMERO_CC++;
				case "CA":
					return Producto.NUMERO_CA++;
				default:
					break;
				}
			} else if (this.getClass() == Tarjeta.class) {
				return Producto.NUMERO_TC++;
			}

			return null;
		}

}
