package ejercicio15;

import java.util.Scanner;

public class Ejercicio15
{
    public static void main(String[] args)
    {
        final Integer IVA = 21;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial price (EUR): ");
        Double initialPrice = sc.nextDouble();
        Double finalPrice = initialPrice * (1.0 + (IVA / 100.0));
        System.out.println("Final price with IVA applied: " + finalPrice + " EUR");
        sc.close();
    }
}