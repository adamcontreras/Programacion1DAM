package ejercicio07;

import java.util.Scanner;

public class Ejercicio07
{
    public static void main(String[] args)
    {
        final Double PRICE_CHILD = 15.50;
        final Double PRICE_ADULT = 20.00;
        final Double DISCOUNT = 0.05;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of child tickets: ");
        Integer childTickets = sc.nextInt();
        System.out.print("Enter number of adult tickets: ");
        Integer adultTickets = sc.nextInt();
        Double rawTotal = (childTickets * PRICE_CHILD) + (adultTickets * PRICE_ADULT);
        Double finalTotal = (rawTotal >= 100.0) ? rawTotal * (1.0 - DISCOUNT) : rawTotal;
        System.out.println("Total price: " + finalTotal + " EUR");
        sc.close();
    }
}