package ejercicioRetoFinal;

import java.util.Scanner;

public class EjercicioRetoFinal 
{
	public static void main(String[] args) 
	{
		System.out.println("Menu");
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme a");
		Integer a = sc.nextInt();
		System.out.println("Deme b");
		Integer b = sc.nextInt();
		System.out.println("1: Hacer suma");
		System.out.println("2: Hacer producto");
		System.out.println("3: Salir");
		System.out.println("Deme una opcion");
		Integer opcion = sc.nextInt();
		switch (opcion) 
		{
		case 1: 
		{
			System.out.println("La suma es: " + (a + b));
			break;
		}
		case 2:
		{
			System.out.println("El producto " + (a * b));
			break;
		}
		default:
			System.out.println("Opcion no es valida");
		}
	}
}
