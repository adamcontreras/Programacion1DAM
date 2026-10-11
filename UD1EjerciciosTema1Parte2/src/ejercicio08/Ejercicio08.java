package ejercicio08;

import java.util.Scanner;

public class Ejercicio08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter throw distance in meters: ");
        Double meters = sc.nextDouble();
        Double centimeters = meters * 100.0;
        Integer integerCm = centimeters.intValue();
        System.out.println("Score in centimeters: " + integerCm + " cm");
        sc.close();
    }
}