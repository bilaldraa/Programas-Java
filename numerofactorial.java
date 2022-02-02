import java.util.*;
public class numerofactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un número por favor");
		
		int numero=sc.nextInt();
		int resultado= 1;
	
		for (int i=numero;i>0;i--) {
			resultado= resultado*i;
		}
	System.out.println("El factorial de "+numero+" es "+resultado);
	
	}
	

}
