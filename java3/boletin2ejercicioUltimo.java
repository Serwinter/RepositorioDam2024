package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicioUltimo {

	public static void main(String[] args) {
		// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un día del mes");
		int dia= sc.nextInt();
		System.out.println("Introduce un mes del año");
		int mes= sc.nextInt();
		System.out.println("Introduce un año");
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
