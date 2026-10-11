package ejercicio05;

import java.util.Scanner;

public class Ejercicio05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        Integer totalSeconds = sc.nextInt();
        Integer hours = totalSeconds / 3600;
        Integer minutes = (totalSeconds % 3600) / 60;
        Integer seconds = totalSeconds % 60;
        System.out.println(totalSeconds + " seconds equals: " + hours + "h " + minutes + "m " + seconds + "s");
        sc.close();
    }
}