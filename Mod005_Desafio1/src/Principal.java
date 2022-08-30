
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vectores  = {10, 20, 5, 15, 30, 20};
		int i, total=0, maximo= vectores [0], cont=0;
		for (i=0; i < vectores.length; i++) {
			if(i%2==1)								//Si el modulo es 1 el nro es impar, si el nro es 2 es par
				System.out.println("Posicion impar"+ " " + i + " " + " valor: " + vectores[i]);
				total = total + vectores[i];
				if (vectores[i] > maximo) maximo = vectores[i];
				if (vectores[i] == 20) cont++;
		}
		System.out.println("El mayor numero es: " + maximo);
		System.out.println("El total es: " + total);
		System.out.println("El numero 20 se mostró: " + cont+" veces");

	}

}
