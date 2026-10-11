package ejercicio03;

import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 (num1): ");
        Integer num1 = sc.nextInt();
        System.out.print("Enter number 2 (num2): ");
        Integer num2 = sc.nextInt();
        Integer toAdd = (num2 - (num1 % num2)) % num2;
        System.out.println("Amount to add to " + num1 + " to make it a multiple of " + num2 + ": " + toAdd);
        sc.close();
    }
}