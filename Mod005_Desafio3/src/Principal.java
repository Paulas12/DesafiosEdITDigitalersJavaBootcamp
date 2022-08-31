
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
		String [] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		double total = 0, maximo = inflacion [0], minimo= inflacion [0]; 
		String mesMin = " ", mesMax = " ";
		int i;
		
		for (i=0; i<inflacion.length; i++) {
			total= total + inflacion[i];
			if (inflacion[i] < minimo){ 
				minimo = inflacion[i];
				mesMin = mes[i];
			}
			if (inflacion [i] > maximo) {
				maximo = inflacion [i];
				mesMax = mes[i];
			}
		}
		
		System.out.println("La inflación anual es de: "+ " " + total); 
		System.out.println("La minima inflacion fue de: " + minimo +"%, mes: "+ mesMin);
		System.out.println("La maxima inflacion fue de: " + maximo +"%, mes: "+ mesMax);
		System.out.println("Promedio: " + total/12 + " " + "%");
	}
}
