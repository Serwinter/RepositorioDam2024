package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicio6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Introduce número de horas trabajadas ");
		int horastrabajadas= sc.nextInt();
		sc.close();
		
		if (horastrabajadas<=40) {
			System.out.println(" El sueldo de esta semana es: " + (horastrabajadas*12));
		}else{
			System.out.println(" El sueldo de esta semana es: " + ((40*12) + (horastrabajadas-40)*16) );
		}
	}

}
