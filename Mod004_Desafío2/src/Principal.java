
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mes = 1;
		double dinero = 1000;
	
		System.out.println("Inversion");
		while (mes < 12) {
			dinero = dinero + 20;  
			mes++; 
		
		double informarDinero = Math.round(dinero*100.0)/100.0;
		System.out.println("Mes " + mes + ": $"+ informarDinero);
		}
		
		
		
	}

}
