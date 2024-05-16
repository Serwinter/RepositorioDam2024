package ejercicios.java3;

import java.util.Scanner;

public class boletin2ejercicio8 {

	public static void main(String[] args) {
		// Mini cuestionario con 5 preguntas tipo test sobre las asignaturas que se imparten en el curso.
		// Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("P1. Las variables se usan para: ");
		System.out.println("a) Crear funciones");
		System.out.println("b) Guardar datos");
		System.out.println("c) Mantener los valores iniciales");
		int respuesta1 = sc.nextInt();
		int puntuacion = 0;
		if (respuesta1 == 2) {
			puntuacion ++;
		}
		
		System.out.println("P2. En Bases de Datos empezamos por: ");
		System.out.println("a) SQL");
		System.out.println("b) HTML");
		System.out.println("c) Modelo E-R");
		int respuesta2= sc.nextInt();
		if (respuesta2 == 3) {
			puntuacion ++;
		}
		
		System.out.println("P3. Los profesores de la asignatura de Sistemas Informáticos son:");
		System.out.println("a) Jaime y Adrián");
		System.out.println("b) Bad Bunny y Lucía");
		System.out.println("c) Javier y Carlos");
		int respuesta3= sc.nextInt();
		if (respuesta3 == 3) {
			puntuacion ++;
		}
		
		System.out.println("P4. Después de una clase de 3 horas de programación necesitamos urgentemente:");
		System.out.println("a) Descansito");
		System.out.println("b) Cigarrito");
		System.out.println("c) Todas son correctas");
		int respuesta4= sc.nextInt();
		if (respuesta4==3) {
			puntuacion ++;
		}
		sc.close();
		System.out.println("La puntuacion total es: "+ puntuacion);
	}

}
