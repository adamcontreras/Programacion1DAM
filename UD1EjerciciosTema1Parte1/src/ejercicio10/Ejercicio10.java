package ejercicio10;

import java.util.Scanner;

public class Ejercicio10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        Integer number = sc.nextInt();
        Boolean isEven = (number % 2 == 0);
        System.out.println("Is even: " + isEven);
        sc.close();
    }
}

