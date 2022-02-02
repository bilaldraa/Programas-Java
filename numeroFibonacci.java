import java.util.*;
public class numeroFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		System.out.println("¿Qué número de la serie fibonacci quiere conocer?");
		int numero=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=0;i<numero;i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}


			
		
		
	}

}
