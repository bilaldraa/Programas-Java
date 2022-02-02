import java.util.*;
public class numerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca un número, por favor");
		int numero=sc.nextInt();
		boolean primo=true;
		for(int i=2;i<numero;i++) {
			int resto=numero%i;
			
			if(resto==0) {
				primo=false;
			}
		}if (primo==false) {
			System.out.println("El número "+numero+ " no es Primo.");
		}else {
			System.out.println("El número "+numero+"  es Primo.");
		}
	}

}
