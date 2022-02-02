import java.util.*;

public class quitaespacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		String nuevafrase = "";

		for (int i = 0; i < frase.length(); i++) {
			// nuevafrase=nuevafrase+frase.charAt(i);
			if (frase.charAt(i) == ' ') {
				nuevafrase = nuevafrase;

			} else {
				nuevafrase = nuevafrase + frase.charAt(i);

			}

		}
		System.out.println(nuevafrase);
	}

}
