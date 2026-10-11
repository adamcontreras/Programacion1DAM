package ejercicio13;

import java.util.Scanner;

public class Ejercicio13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cantidad de dinero  ");
        Double dineroTotal = sc.nextDouble();
        Integer euros = dineroTotal.intValue();
        Double parteDecimal = dineroTotal - euros;
        Long centimos = Math.round(parteDecimal * 100);
        System.out.println("Euros: " + euros + " euros");
        System.out.println("Centimos: " + centimos + " centimos");
        sc.close();
    }
}