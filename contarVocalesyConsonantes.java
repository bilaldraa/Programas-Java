import java.util.*;

public class contarVocalesyConsonantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase, por favor.");
		String frase = sc.nextLine().toLowerCase();
		String nuevafrase = "";
		int vocalcontador = 0;
		int consonantecontador = 0;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				nuevafrase = nuevafrase;

			} else {
				nuevafrase = nuevafrase + frase.charAt(i);

			}

		}

		for (int i = 0; i < nuevafrase.length(); i++) {

			if (nuevafrase.charAt(i) == 'a' || nuevafrase.charAt(i) == 'e' || nuevafrase.charAt(i) == 'i'
					|| nuevafrase.charAt(i) == 'o' || nuevafrase.charAt(i) == 'u') {
				vocalcontador++;

			} else if (nuevafrase.charAt(i) >= 'b' & nuevafrase.charAt(i) <= 'z') {
				consonantecontador++;

			}

		}
		System.out.println("La frase tiene " + vocalcontador + " vocales y " + consonantecontador + " consonantes");

	}

}
