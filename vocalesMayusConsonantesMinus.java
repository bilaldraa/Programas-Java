import java.util.*;
public class vocalesMayusConsonantesMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca una frase");
		String frase=sc.nextLine();
		String frasenueva="";
		
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
					||frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
				frasenueva=frasenueva+Character.toUpperCase(frase.charAt(i));
				
			
			}else if (frase.charAt(i) >= 'b' & frase.charAt(i) <= 'z') {
				frasenueva=frasenueva+Character.toLowerCase(frase.charAt(i));
			}
			else {
				frasenueva=frasenueva+frase.charAt(i);
			}
			
		}
		System.out.println(frasenueva);
	}
}
