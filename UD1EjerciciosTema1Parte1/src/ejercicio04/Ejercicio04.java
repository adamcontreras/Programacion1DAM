package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 
{
	public static void main(String[] args) 
	{
//		4. Crear una aplicación que calcule la media aritmética de dos notas enteras.
//		Hay que tener en cuenta que la nota media puede tener decimales.
		Scanner sc = new Scanner(System.in);
		System.out.println("Write two integer grades");
		Integer firstGrade;
		Integer secondGrade;
		firstGrade = sc.nextInt();
		secondGrade = sc.nextInt();
		Double arithmeticMean = (double) (firstGrade + secondGrade) / 2;
		System.out.println("Your average grade is "+ arithmeticMean);
		sc.close();
	}
}
