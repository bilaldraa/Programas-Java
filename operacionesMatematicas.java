import java.util.*;
public class operacionesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un n�mero");
		int numero=sc.nextInt();
		System.out.println("Introduzca otro n�mero");
		int numero2=sc.nextInt();
		
		int suma= numero+numero2;
		int resta= numero-numero2;
		int multiplicaci�n= numero*numero2;
		int division=numero/numero2;
		int resto= numero%numero2;
		
		System.out.println("La suma de "+numero+" y "+numero2+ " es = "+suma);
		System.out.println("La resta de "+numero+" y "+numero2+ " es = "+resta);
		System.out.println("La multiplicaci�n de "+numero+" por "+numero2+ " es = "+multiplicaci�n);
		System.out.println("La division de "+numero+" entre "+numero2+ " es = "+division);
		System.out.println("El resto de "+numero+" entre "+numero2+ " es = "+resto);
		
	}

}
