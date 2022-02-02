import java.util.*;
public class extractorVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase=sc.nextLine();
		String nuevafrase="";
		
		for(int i=0;i<frase.length();i++) {
			
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
					||frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
				nuevafrase=nuevafrase+frase.charAt(i);
			}
			else {
				nuevafrase=nuevafrase;
			}
		}
		System.out.println(nuevafrase);
	}

}
