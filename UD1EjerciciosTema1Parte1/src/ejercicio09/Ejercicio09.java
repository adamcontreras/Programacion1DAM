package ejercicio09;

import java.util.Scanner;

public class Ejercicio09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        Integer age = sc.nextInt();
        Boolean isAdult = age >= 18;
        System.out.println("Is adult: " + isAdult);
        sc.close();
    }
}