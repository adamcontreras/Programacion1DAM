package ejercicio12;

import java.util.Scanner;

public class Ejercicio12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad ");
        Integer edad = sc.nextInt();
        Double precio = (edad < 18) ? 6.50 : 9.50;
        System.out.println("El precio de tu entrada es " + precio + " euros");
        sc.close();
    }
}