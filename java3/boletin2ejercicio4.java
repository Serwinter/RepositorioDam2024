package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Introduce el valor del radio de una circunferencia");
		double radio= sc.nextDouble();
		System.out.println(" Elija una opción ");
		System.out.println(" 1. Calcular diámetro ");
		System.out.println(" 2. Calcular perímetro ");
		System.out.println(" 3. Calcular área ");
		int opcionusuario= sc.nextInt();
		sc.close();
		
		switch (opcionusuario) {
		case 1:
			double diametro= (radio*2);
			System.out.println(" El diámetro es: " + diametro);
			break;
		case 2:
			double perimetro= (2*Math.PI*radio);
			System.out.println(" El perímetro es: " + perimetro);
			break;
		case 3:
			double area= (Math.PI*Math.pow(radio, 2));//radio*radio);
			System.out.println(" El área es: "+ area);
			break;
		default:
			System.out.println(" Ninguna de las opciones elegida es válida");
		}

	}

}
