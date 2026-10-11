package ejercicio10;

import java.util.Scanner;

public class Ejercicio10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        Integer year = sc.nextInt();
        Integer century = (year - 1) / 100 + 1;
        System.out.println("Century: " + century);
        sc.close();
    }
}