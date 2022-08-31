
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1°. Pensar en qué necesito definir 
		
		double [] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
		double total = 0, maximo = inflacion [0], minimo= inflacion [0]; 
		int i, mesMin = 0, mesMax = 12; 
		
		for (i=0; i<inflacion.length; i++) {
			total= total + inflacion[i];
			if (inflacion[i] < minimo){ 
				minimo = inflacion[i];
				mesMin = i + 1;
			}
			if (inflacion [i] > maximo) {
				maximo = inflacion [i];
				mesMax = i+1;
			}
			
		}
				System.out.println("La inflación anual es de: "+ " " + total); 
				
				System.out.println("La minima inflacion fue de: " + minimo +"% mes:"+ mesMin);
				
				System.out.println("La maxima inflacion fue de: " + maximo +"% mes:"+ mesMax);
				
				System.out.println("Promedio: " + total/12 + "%");

	}

}
