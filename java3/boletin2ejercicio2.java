package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicio2 { /* Crea un programa que pida un n�mero entero al usuario y d� a una variable 
									llamada par el valor 1 si ese n�mero es par o el valor 0 si no es par. Hazlo 
									primero con un "if" y luego con un "operador condicional"*/

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Introduce un n�mero entero");
		int numUsuario= sc.nextInt();
		int par;
		sc.close();
		
		if (numUsuario % 2 == 0) {
			par=1;
		}else{
			par=0;
		}
		System.out.println("El valor de 'par' es: " + par);
	}

}

