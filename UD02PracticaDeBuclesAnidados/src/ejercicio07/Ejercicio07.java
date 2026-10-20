package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime N");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N; i++) 
		{
			for (int j = 0; j < 2*N  -1; j++) 
			{
				if (j >= N-i-1 && j <= N+i-1) 
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

//
