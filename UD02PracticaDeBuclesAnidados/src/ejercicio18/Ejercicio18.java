package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 
{
	public static void main(String[] args) 
	{
		   Scanner sc = new Scanner(System.in);
	        System.out.println("Dame la altura.");
	        Integer n = sc.nextInt();

	        for (int e = 0; e < n * 2 - 1; e++) 
	        {
	            System.out.println();
	            for (int i = 0; i < n * 2; i++) 
	            {
	                if (e < n) 
	                {
	                    if (i < n) 
	                    {
	                        if (i < e) 
	                        {
	                            System.out.print(" ");
	                        } 
	                        else 
	                        {
	                            System.out.print("*");
	                        }
	                    } 
	                    else 
	                    {
	                        if ((i + e) < n * 2 - 1) 
	                        {
	                            System.out.print("*");
	                        } 
	                        else 
	                        {
	                            System.out.print(" ");
	                        }
	                    }
	                } 
	                else 
	                {
	                    if (i <= n) 
	                    {
	                        if ((i + e) <= (n * 2 - 3)) 
	                        {
	                            System.out.print(" ");
	                        } 
	                        else 
	                        {
	                            System.out.print("*");
	                        }
	                    } 
	                    else 
	                    {
	                        if (i > e) 
	                        {
	                            System.out.print(" ");
	                        } 
	                        else 
	                        {
	                            System.out.print("*");
	                        }
	                    }
	                }
	            }
	        }
	        sc.close();
	    }
	
		
	}

