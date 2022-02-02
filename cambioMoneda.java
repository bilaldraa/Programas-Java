import java.util.*;

public class cambioMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println("el precio es de " + precio+" euros.");
			System.out.println("Usted ha introducido: " + introducir + " euros.");
			System.out.println("El cambio es de:" );
			
			if(billete50>=1) {
				System.out.println("Billete de 50: "+billete50);
			}
			 if(billete20>=1) {
				System.out.println("Billetes de 20: "+billete20);
			}
			 if(billete10>=1) {
				System.out.println("Billetes de 10: "+billete10);
			}
			 if(billete5>=1) {
				System.out.println("Billetes de 5: "+billete5);
			}
			 if(moneda2>=1) {
				System.out.println("Monedas de 2 euros: "+moneda2);
			}
			 if(moneda1>=1) {
				System.out.println("Monedas de 1 euros: "+moneda1);
			}
			 if(cent50>=1) {
				System.out.println("Monedas de 50 cent: "+cent50);
			}
			 if(cent20>=1) {
				System.out.println("Monedas de 20 cent: "+cent20);
			}
			 if(cent10>=1) {
				System.out.println("Monedas de 10 cent: "+cent10);
			}
			 if(cent5>=1) {
				System.out.println("Monedas de 5 cent: "+cent5);
			}
			 if(cent2>=1) {
				System.out.println("Monedas de 2 cent: "+cent2);
			}
			 if(cent1>=1) {
				System.out.println("Monedas de 1 cent: "+cent1);
			}
			
			
			
			
			
			
			
			
			
			//System.out.println("El cambio es de " + billete50 + " billetes de 50 " + billete20 + " billetes de 20 "
					//+ billete10 + " billetes de 10 " + billete5 + " billetes de 5 " + moneda2 + " monedas de 2 "
					//+ moneda1 + " monedas de 1 " + cent50 + " monedas de 50cent " + cent20 + " monedas de 20cent "
					//+ cent10 + " monedas de 10cent " + cent5 + " monedas de 5 cent " + cent2 + " monedas de 2cent "
					//+ cent1 + "monedas de 1 cent ");

		}
	}

}
