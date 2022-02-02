import java.util.*;
public class invertirCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca una frase, por favor.");
		String frase=sc.nextLine();
		String nuevafrase="";
		
		for(int i=frase.length()-1;i>=0;i--) {
			
			nuevafrase=nuevafrase+frase.charAt(i);
			
		}
		System.out.println(nuevafrase);
	}

}
