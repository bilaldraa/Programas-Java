import java.util.Scanner;

public class ProgramaEcuacion2grado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el coeficiente a");
		double coeficienteA=sc.nextDouble();
		System.out.print("Introduzca el coeficiente b");	
		double coeficienteB=sc.nextDouble();
		System.out.print("Introduzca el coeficiente c");
		double coeficienteC=sc.nextDouble();
		
			if (Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC <0){
				System.out.println("La ecuación no puede ser calculada");
				return;
			}
				
			double solucion1=(-coeficienteB+Math.sqrt(Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC))/2*coeficienteA;{
			System.out.println("X1="+solucion1);
			}
			double solucion2=(-coeficienteB-Math.sqrt(Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC))/2*coeficienteA;{
			System.out.println("X2="+solucion2);
			}
			}
			
			 
				

	}


