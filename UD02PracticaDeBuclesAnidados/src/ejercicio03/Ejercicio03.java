package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 
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
				if (i>=j) 
				{
					System.out.print("*");			
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
