package ejercicio06;

import java.util.Scanner;

public class Ejercicio06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in millimeters: ");
        Double mm = sc.nextDouble();
        System.out.print("Enter distance in centimeters: ");
        Double cm = sc.nextDouble();
        System.out.print("Enter distance in meters: ");
        Double m = sc.nextDouble();
        Double totalCm = (mm / 10.0) + cm + (m * 100.0);
        System.out.println("Total distance in centimeters: " + totalCm + " cm");
        sc.close();
    }
}