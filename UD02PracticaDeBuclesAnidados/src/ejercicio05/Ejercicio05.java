package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime N");
		Integer N = sc.nextInt();
		
		for (int j = 0; j < N; j++) 
		{
			for (int i = 0; i < N; i++) 
			{
				if (i>=j) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
