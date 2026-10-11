package ejercicio11;

import java.util.Scanner;

public class Ejercicio11
{
    public static void main(String[] args)
    {
        final Double PESETAS_PER_EURO = 166.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in pesetas: ");
        Double pesetas = sc.nextDouble();
        Double euros = pesetas / PESETAS_PER_EURO;
        System.out.println("Equivalent in euros: " + euros + " EUR");
        sc.close();
    }
}