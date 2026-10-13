package ejercicio01;


import java.util.Scanner;

public class Ejercicio01 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime filas");
		Integer filas = sc.nextInt();
		System.out.println("Dame columnas");
		Integer columnas = sc.nextInt();
		
		for (int i = 1; i <= filas; i++) 
		{
			for (int j = 1; j <= columnas; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
