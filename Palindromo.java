import java.util.*;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase.");
		String frase = sc.nextLine().toLowerCase();
		String fraseReves = "";
		String nuevafrase = "";

		for (int i = 0; i < frase.length(); i++) {
			// nuevafrase=nuevafrase+frase.charAt(i);
			if (frase.charAt(i) == ' ') {
				nuevafrase = nuevafrase;

			} else if (frase.charAt(i) >= 'a') {
				nuevafrase = nuevafrase + frase.charAt(i);
			}

			else {
				nuevafrase = nuevafrase;

			}

		}

		for (int i = nuevafrase.length() - 1; i >= 0; i--) {
			fraseReves = fraseReves + nuevafrase.charAt(i);

		}
		System.out.println(fraseReves);
		System.out.println(nuevafrase);

		boolean iguales = true;
		for (int i = 0; i < fraseReves.length(); i++) {
			if (fraseReves.charAt(i) != nuevafrase.charAt(i)) {
				iguales = false;
			}
		}

		if (iguales) {
			System.out.println("La frase Si es palíndromo.");
		} else {
			System.out.println("La frase NO es palíndromo.");
		}
	}

}
