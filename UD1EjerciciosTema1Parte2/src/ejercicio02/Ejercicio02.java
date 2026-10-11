package ejercicio02;

import java.util.Scanner;

public class Ejercicio02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        Integer number = sc.nextInt();
        Integer toAdd = (7 - (number % 7)) % 7;
        System.out.println("Amount to add to make it a multiple of 7: " + toAdd);
        sc.close();
    }
}