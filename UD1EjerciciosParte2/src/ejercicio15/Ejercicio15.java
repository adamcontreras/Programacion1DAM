package ejercicio15;

import java.util.Scanner;

public class Ejercicio15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el entero a ");
        Integer a = sc.nextInt();
        System.out.print("Introduce el entero b ");
        Integer b = sc.nextInt();
        System.out.print("Introduce el entero c ");
        Integer c = sc.nextInt();
        Integer resultado1 = a + b * c;
        Integer resultado2 = (a + b) * c;
        System.out.println("Resultado de a + b * c " + resultado1);
        System.out.println("Resultado de (a + b) * c " + resultado2);
        sc.close();
    }
}