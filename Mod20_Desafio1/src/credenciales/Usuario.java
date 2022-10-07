package credenciales;

public class Usuario {
	private String correo;
	private String contraseña;

	public Usuario(String correo, String contraseña) {
		super();
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public Usuario() {
		super();

	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean esUsuarioValido() {
		String dominio = "@educacionit.com";
		

		if (correo.contains(dominio)) {
			
			if ((contraseña.substring(0, 1).equals(contraseña.substring(0, 1).toUpperCase()))
				&& ((contraseña.contains("*")) || (contraseña.contains(".")) || (contraseña.contains("-"))
							|| (contraseña.contains("_")))) {
				
				System.out.println("Los datos ingresados son correctos");
				System.out.println("Usuario " + "[correo: " + correo + ", clave: " + contraseña + "]" );
				return true;
				
			} else {
				System.out.println("Correo incorrecto, intente de nuevo");
				return false;
			}
			
		}else {
			System.out.println("Clave incorrecta, intente de nuevo");
			return false;
		}
		
	}
	
}
