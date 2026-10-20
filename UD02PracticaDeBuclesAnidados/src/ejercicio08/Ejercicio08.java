package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime N");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N; i++) 
		{
			for (int j = 0; j < 2*N-1; j++) 
			{
				if (j >= i && j < 2*N -1 -i) 
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
