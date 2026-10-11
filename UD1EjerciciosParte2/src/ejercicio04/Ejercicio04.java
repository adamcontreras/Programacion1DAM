package ejercicio04;

import java.util.Scanner;

public class Ejercicio04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero ");
        Double numero = sc.nextDouble();
        Integer inferior = (int) Math.floor(numero);
        Integer superior = (int) Math.ceil(numero);
        Long cercano = Math.round(numero);
        System.out.println("Entero inmediatamente inferior " + inferior);
        System.out.println("Entero inmediatamente superior " + superior);
        System.out.println("Entero mas cercano " + cercano);
        sc.close();
    }
}