package ejercicio05;

import java.util.Scanner;

public class Ejercicio05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero real: ");
        Double numero = sc.nextDouble();
        Double valorAbsoluto = Math.abs(numero);
        Double raizCuadrada = Math.sqrt(numero);
        System.out.println("Valor absoluto: " + valorAbsoluto);
        System.out.println("Raiz cuadrada: " + raizCuadrada);
        sc.close();
    }
}