package ejercicio07;

import java.util.Scanner;

public class Ejercicio07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = sc.nextLine();
        System.out.print("Enter your address ");
        String address = sc.nextLine();
        System.out.print("Enter your phone number ");
        String phone = sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);

        sc.close();
    }
}