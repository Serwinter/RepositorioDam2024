package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Introduce el valor del radio de una circunferencia");
		double radio= sc.nextDouble();
		System.out.println(" Elija una opci�n ");
		System.out.println(" 1. Calcular di�metro ");
		System.out.println(" 2. Calcular per�metro ");
		System.out.println(" 3. Calcular �rea ");
		int opcionusuario= sc.nextInt();
		sc.close();
		
		switch (opcionusuario) {
		case 1:
			double diametro= (radio*2);
			System.out.println(" El di�metro es: " + diametro);
			break;
		case 2:
			double perimetro= (2*Math.PI*radio);
			System.out.println(" El per�metro es: " + perimetro);
			break;
		case 3:
			double area= (Math.PI*Math.pow(radio, 2));//radio*radio);
			System.out.println(" El �rea es: "+ area);
			break;
		default:
			System.out.println(" Ninguna de las opciones elegida es v�lida");
		}

	}

}
