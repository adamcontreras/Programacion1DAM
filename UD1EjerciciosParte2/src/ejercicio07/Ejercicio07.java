package ejercicio07;

import java.util.Random;

public class Ejercicio07
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Integer numeroEntero = rand.nextInt(100) + 1;
        Double numeroReal = rand.nextDouble();
        Boolean booleano = rand.nextBoolean();
        System.out.println("Entero aleatorio (1-100) " + numeroEntero);
        System.out.println("Real aleatorio " + numeroReal);
        System.out.println("Booleano aleatorio " + booleano);
    }
}