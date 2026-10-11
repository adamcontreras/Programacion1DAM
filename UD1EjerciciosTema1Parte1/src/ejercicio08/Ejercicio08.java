package ejercicio08;

import java.util.Scanner;

public class Ejercicio08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        Integer age = sc.nextInt();
        System.out.println("Hello " + name + " you are " + age + " years old how old you are!");
        sc.close();
    }
}