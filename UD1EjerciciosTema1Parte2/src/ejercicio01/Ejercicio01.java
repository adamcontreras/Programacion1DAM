package ejercicio01;

import java.util.Scanner;

public class Ejercicio01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        Double number = sc.nextDouble();
        Integer rounded = (int) (number + 0.5);
        System.out.println("Rounded to nearest integer: " + rounded);
        sc.close();
    }
}