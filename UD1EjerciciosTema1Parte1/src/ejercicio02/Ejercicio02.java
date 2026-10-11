package ejercicio02;

import java.util.Scanner;

public class Ejercicio02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        Integer age = sc.nextInt();
        Integer nextAge = age + 1;
        System.out.println("Next year you will be: " + nextAge + " years old");
        sc.close();
    }
}