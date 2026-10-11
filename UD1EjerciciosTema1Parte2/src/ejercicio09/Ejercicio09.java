package ejercicio09;

import java.util.Scanner;

public class Ejercicio09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter problem ID: ");
        Integer problemId = sc.nextInt(); 
        Integer volume = problemId / 100;
        System.out.println("Volume number: " + volume);
        sc.close();
    }
}