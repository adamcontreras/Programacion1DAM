package ejercicio12;

import java.util.Scanner;

public class Ejercicio12
{
    public static void main(String[] args)
    {
        final Double APPLE_PRICE = 2.35;
        final Double PEAR_PRICE = 1.95;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilograms of apples sold: ");
        Double appleKilos = sc.nextDouble();
        System.out.print("Enter kilograms of pears sold: ");
        Double pearKilos = sc.nextDouble();
        Double appleIncome = appleKilos * APPLE_PRICE;
        Double pearIncome = pearKilos * PEAR_PRICE;
        Double totalIncome = appleIncome + pearIncome;
        System.out.println("Total profit: " + totalIncome + " EUR");
        sc.close();
    }
}