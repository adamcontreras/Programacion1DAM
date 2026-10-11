package ejercicio13;

import java.util.Scanner;

public class Ejercicio13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is it raining? (true/false): ");
        Boolean isRaining = sc.nextBoolean();
        System.out.print("Have you finished your homework? (true/false): ");
        Boolean homeworkDone = sc.nextBoolean();
        System.out.print("Do you need to go to the library? (true/false): ");
        Boolean libraryNeeded = sc.nextBoolean();
        Boolean canGoOutside = (!isRaining && homeworkDone) || libraryNeeded;
        System.out.println("Can go outside: " + canGoOutside);
        sc.close();
    }
}