package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicio9 {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un número entre 0 y 9.999");
		int numero= sc.nextInt();
		sc.close();
		if (numero<=9) {
			System.out.println("El número tiene 1 cifra");
		}else {
			if (numero<=99) {
				System.out.println("El número tiene 2 cifras");
			}else {
				if (numero<=999) {
					System.out.println("El número tiene 3 cifras");
				}else {
					if (numero<=9999) {
						System.out.println("El número tiene 4 cifras");
					}else {
						System.out.println("El número introducido es mayor de 9.999");
					}
				}
			}
		}

	}

}
