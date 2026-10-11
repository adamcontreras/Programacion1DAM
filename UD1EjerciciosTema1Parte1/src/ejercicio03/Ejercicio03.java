package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 
{
	public static void main(String[] args) 
	{
//		3. Escribir una aplicación que pida el año actual 
//		y el año de nacimiento del usuario. Debe calcular su edad.
		
		Scanner sc = new Scanner(System.in);
		Integer currentYear;
		Integer birthYear;
		System.out.println("Tell me the current year and your year of birth in that order");
		currentYear = sc.nextInt();
		birthYear = sc.nextInt();
		System.out.println("Your age is " + currentYear % birthYear);
		sc.close();
	}
}
