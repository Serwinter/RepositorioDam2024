package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicioUltimo {

	public static void main(String[] args) {
		// Pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 d�as. Sin a�os bisiestos.

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un d�a del mes");
		int dia= sc.nextInt();
		System.out.println("Introduce un mes del a�o");
		int mes= sc.nextInt();
		System.out.println("Introduce un a�o");
		int anyo= sc.nextInt();
		sc.close();
		
		if (mes==2) {
			if (dia>28) {
				System.out.println("La fecha introducida es incorrecta");
			}else {
				System.out.println("La fecha introducida es correcta");
			}
			
		}
			System.out.println("");
	}

}
