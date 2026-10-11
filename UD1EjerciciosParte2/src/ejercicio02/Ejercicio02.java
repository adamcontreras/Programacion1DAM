package ejercicio02;

import java.util.Scanner;

public class Ejercicio02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de segundos ");
        Integer totalSegundos = sc.nextInt();
        Integer horas = totalSegundos / 3600;
        Integer minutos = (totalSegundos % 3600) / 60;
        Integer segundos = totalSegundos % 60;
        System.out.println(totalSegundos + " segundos equivalen a "  + horas + "h " + minutos + "m " + segundos + "s");
        sc.close();
    }
}