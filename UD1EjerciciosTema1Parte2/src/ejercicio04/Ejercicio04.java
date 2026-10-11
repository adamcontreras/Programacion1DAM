package ejercicio04;

import java.util.Scanner;

public class Ejercicio04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        Double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        Double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        Double c = sc.nextDouble();
        System.out.print("Enter value of x: ");
        Double x = sc.nextDouble();
        Double y = a * Math.pow(x, 2) + b * x + c;
        System.out.println("Value of y: " + y);
        sc.close();
    }
}