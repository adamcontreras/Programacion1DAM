package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime N");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N; i++) 
		{
			for (int j = 0; j < N; j++) 
			{
				if (j>=i) 
				{
					System.out.print("*");			
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
