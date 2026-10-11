package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 
{
	public static void main(String[] args) 
	{
//		1. Diseña un programa que pida un número al usuario y a continuación lo muestre.

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		Integer number = sc.nextInt();
		System.out.println("Your number is " + number);
		sc.close();
	}
}
