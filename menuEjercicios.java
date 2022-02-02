import java.util.*;

public class menuEjercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//leerMenu();
		int ejercicio = 1;
		while(ejercicio!=15) {
			leerMenu();
			ejercicio=sc.nextInt();
			
		switch (ejercicio) {

		case 1:
			operacionesMatematicas();
			break;
		case 2:
			fibonacci();
			break;
		case 3:
			numerosPrimos();
			break;
		case 4:
			cambioMonedas();
			break;
		case 5:
			ecuacion2grado();
			break;
		case 6:
			quitaEspacios();
			break;
		case 7:
			invertirCadena();
			break;
		case 8:
			contarVocalesyConsonantes();
			break;
		case 9:
			vocalesaMayusyConsonantesaMin();
			break;
		case 10:
			extractorVocales();
			break;
		case 11:
			factorial();
			break;
		case 12:
			palindromo();
			break;
		case 13:
			encriptador();
			break;
		case 14:
			diamanteAsterisco();
			break;

		default:
			if(ejercicio==15) {
			System.out.println("Ha salido del Menú, muchas gracias.");
			}else {
				System.out.println("Opción incorrecta. Vuelva a introducir un número");
			}
		}
		}
	}

	public static void leerMenu() {
		System.out.println();
		System.out.println("******Bienvenido al Menú de ejercicios******");
		System.out.println("1. Operaciones matemáticas.");
		System.out.println("2. Serie de Fibonacci.");
		System.out.println("3. Numero Primo.");
		System.out.println("4. Cambio de monedas.");
		System.out.println("5. Ecuación de segundo grado.");
		System.out.println("6. Quitar espacios.");
		System.out.println("7. Invertir cadena.");
		System.out.println("8. Contar vocales y consonantes.");
		System.out.println("9. Pasar vocales a mayúsculas y consonantes a minúsculas.");
		System.out.println("10. Extractor de vocales.");
		System.out.println("11. Factorial.");
		System.out.println("12. Palíndromo.");
		System.out.println("13. Encriptador.");
		System.out.println("14. Diamante de asteriscos.");
		System.out.println("15. Salir del Menú.");
		System.out.println("************************************************");
	}

	public static void operacionesMatematicas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		System.out.println("Introduzca otro número");
		int numero2 = sc.nextInt();

		int suma = numero + numero2;
		int resta = numero - numero2;
		int multiplicación = numero * numero2;
		int division = numero / numero2;
		int resto = numero % numero2;

		System.out.println("La suma de " + numero + " y " + numero2 + " es = " + suma);
		System.out.println("La resta de " + numero + " y " + numero2 + " es = " + resta);
		System.out.println("La multiplicación de " + numero + " por " + numero2 + " es = " + multiplicación);
		System.out.println("La division de " + numero + " entre " + numero2 + " es = " + division);
		System.out.println("El resto de " + numero + " entre " + numero2 + " es = " + resto);

	}

	public static void fibonacci() {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Qué número de la serie fibonacci quiere conocer?");
		int numero = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 0; i < numero; i++) {

			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}

	public static void numerosPrimos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número, por favor");
		int numero = sc.nextInt();
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			int resto = numero % i;

			if (resto == 0) {
				primo = false;
			}
		}
		if (primo == false) {
			System.out.println("El número " + numero + " no es Primo.");
		} else {
			System.out.println("El número " + numero + "  es Primo.");
		}
	}

	public static void cambioMonedas() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un precio: ");
		double precio = sc.nextDouble();
		System.out.println("¿Que cantidad de dinero va a introducir?");
		double introducir = sc.nextDouble();

		while (introducir < precio) {
			System.out.println("Cantidad introducida insuficiente");
			System.out.println("Introduzca una cantidad superior: ");
			introducir = sc.nextDouble();

		}
		if (introducir == precio) {
			System.out.println("La vuelta es de " + (introducir - precio) + " euros");
		} else if (introducir > precio) {
			int billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0;
			double moneda2 = 0, moneda1 = 0, cent50 = 0, cent20 = 0, cent10 = 0, cent5 = 0, cent2 = 0, cent1 = 0;

			double vuelta = introducir - precio;

			while (vuelta >= 50) {
				vuelta = vuelta - 50;
				billete50++;

			}
			while (vuelta >= 20) {
				billete20 = 0;
				vuelta = vuelta - 20;
				billete20++;

			}
			while (vuelta >= 10) {
				billete10 = 0;
				vuelta = vuelta - 10;
				billete10++;
			}
			while (vuelta >= 5) {
				billete5 = 0;
				vuelta = vuelta - 5;
				billete5++;
			}
			while (vuelta >= 2) {
				moneda2 = 0;
				vuelta = vuelta - 2;
				moneda2++;
			}
			while (vuelta >= 1) {
				moneda1 = 0;
				vuelta = vuelta - 1;
				moneda1++;
			}
			while (vuelta >= 0.50) {
				cent50 = 0;
				vuelta = vuelta - 0.50;
				cent50++;

			}
			while (vuelta >= 0.20) {
				cent20 = 0;
				vuelta = vuelta - 0.20;
				cent20++;
			}
			while (vuelta >= 0.10) {
				cent10 = 0;
				vuelta = vuelta - 0.10;
				cent10++;
			}
			while (vuelta >= 0.05) {
				cent5 = 0;
				vuelta = vuelta - 0.05;
				cent5++;
			}
			while (vuelta >= 0.02) {
				cent2 = 0;
				vuelta = vuelta - 0.02;
				cent2++;
			}
			while (vuelta >= 0.01) {
				cent1 = 0;
				vuelta = vuelta - 0.01;
				cent1++;
			}
			System.out.println("el precio es de " + precio + " euros.");
			System.out.println("Usted ha introducido: " + introducir + " euros.");
			System.out.println("El cambio es de:");

			if (billete50 >= 1) {
				System.out.println("Billete de 50: " + billete50);
			}
			if (billete20 >= 1) {
				System.out.println("Billetes de 20: " + billete20);
			}
			if (billete10 >= 1) {
				System.out.println("Billetes de 10: " + billete10);
			}
			if (billete5 >= 1) {
				System.out.println("Billetes de 5: " + billete5);
			}
			if (moneda2 >= 1) {
				System.out.println("Monedas de 2 euros: " + moneda2);
			}
			if (moneda1 >= 1) {
				System.out.println("Monedas de 1 euros: " + moneda1);
			}
			if (cent50 >= 1) {
				System.out.println("Monedas de 50 cent: " + cent50);
			}
			if (cent20 >= 1) {
				System.out.println("Monedas de 20 cent: " + cent20);
			}
			if (cent10 >= 1) {
				System.out.println("Monedas de 10 cent: " + cent10);
			}
			if (cent5 >= 1) {
				System.out.println("Monedas de 5 cent: " + cent5);
			}
			if (cent2 >= 1) {
				System.out.println("Monedas de 2 cent: " + cent2);
			}
			if (cent1 >= 1) {
				System.out.println("Monedas de 1 cent: " + cent1);
			}
		}
	}

	public static void ecuacion2grado() {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		System.out.println("Coeficiente b: ");
		b = sc.nextDouble();
		System.out.println("Coeficiente c: ");
		c = sc.nextDouble();
		
		double interiorRaiz = Math.pow(b, 2) - 4*a*c;
		
		if (interiorRaiz<0) {
			System.out.println("La ecuación dada no tiene solución");
		}else {
			double solucion;
			if (interiorRaiz==0) {
				solucion=-b/(2*a);
				System.out.println("La ecuación dada tiene una solucion: x="+solucion);
			}else {
				double solucion2;
				solucion=(-b+Math.sqrt(interiorRaiz))/(2*a);
				solucion2=(-b-Math.sqrt(interiorRaiz))/(2*a);
				System.out.println("La ecuacion dada tiene las soluciones: ");
				System.out.println("x1="+solucion);
				System.out.println("x2="+solucion2);
		}
	}
		}
	

	public static void quitaEspacios() {
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

	public static void invertirCadena() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase, por favor.");
		String frase = sc.nextLine();
		String nuevafrase = "";

		for (int i = frase.length() - 1; i >= 0; i--) {

			nuevafrase = nuevafrase + frase.charAt(i);

		}
		System.out.println(nuevafrase);
	}

	public static void contarVocalesyConsonantes() {
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

	public static void vocalesaMayusyConsonantesaMin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		String frasenueva = "";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u') {
				frasenueva = frasenueva + Character.toUpperCase(frase.charAt(i));

			} else if (frase.charAt(i) >= 'b' & frase.charAt(i) <= 'z') {
				frasenueva = frasenueva + Character.toLowerCase(frase.charAt(i));
			} else {
				frasenueva = frasenueva + frase.charAt(i);
			}

		}
		System.out.println(frasenueva);
	}

	public static void extractorVocales() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine();
		String nuevafrase = "";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u') {
				nuevafrase = nuevafrase + frase.charAt(i);
			} else {
				nuevafrase = nuevafrase;
			}
		}
		System.out.println(nuevafrase);
	}

	public static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número por favor");

		int numero = sc.nextInt();
		int resultado = 1;

		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

	public static void palindromo() {
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

	public static void encriptador() {
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

	public static void diamanteAsterisco() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n = sc.nextInt();

		for (int fila = 1; fila <= n; fila++) {

			if (fila % 2 != 0) {
				for (int espacio = n - 1 - fila; espacio >= 0; espacio--) {
					System.out.print(" ");
				}
				for (int columna = 1; columna <= fila; columna++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {

			}
		}
		for (int fila = n - 1; fila > 0; fila--) {

			if (fila % 2 != 0) {
				for (int espacio = n - 1 - fila; espacio >= 0; espacio--) {
					System.out.print(" ");
				}
				for (int columna = 1; columna <= fila; columna++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {

			}
	}
}
}
