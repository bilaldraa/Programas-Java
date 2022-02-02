import java.util.*;

public class Encriptador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		System.out.println("Para encriptar la frase pulse E");
		System.out.println("Para desencriptar la frase pulse D");
		String letra = sc.next();
		String frasenueva = "";
		if (letra.charAt(0) == 'e') {

			for (int i = 0; i < frase.length(); i++) {

				if (frase.charAt(i) == 'a') {
					frasenueva = frasenueva + 'e';
				} else if (frase.charAt(i) == 'e') {
					frasenueva = frasenueva + 'i';
				} else if (frase.charAt(i) == 'i') {
					frasenueva = frasenueva + 'o';
				} else if (frase.charAt(i) == 'o') {
					frasenueva = frasenueva + 'u';
				} else if (frase.charAt(i) == 'u') {
					frasenueva = frasenueva + 'a';
				} else {
					frasenueva = frasenueva + frase.charAt(i);
				}
			}

		}

		if (letra.charAt(0) == 'd') {

			for (int i = 0; i < frase.length(); i++) {

				if (frase.charAt(i) == 'a') {
					frasenueva = frasenueva + 'u';
				} else if (frase.charAt(i) == 'e') {
					frasenueva = frasenueva + 'a';
				} else if (frase.charAt(i) == 'i') {
					frasenueva = frasenueva + 'e';
				} else if (frase.charAt(i) == 'o') {
					frasenueva = frasenueva + 'i';
				} else if (frase.charAt(i) == 'u') {
					frasenueva = frasenueva + 'o';
				} else {
					frasenueva = frasenueva + frase.charAt(i);
				}
			}

		}
		System.out.println(frasenueva);

	}

}
