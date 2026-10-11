package ejercicio09;

import java.util.Scanner;

public class Ejercicio09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los litros totales del deposito ");
        Double litrosDeposito = sc.nextDouble();
        System.out.print("Introduce la capacidad de cada botella en litros ");
        Double capacidadBotella = sc.nextDouble();
        Integer botellasLlenas = (int) Math.floor(litrosDeposito / capacidadBotella);
        System.out.println("Numero de botellas que se pueden llenar " + botellasLlenas);
        sc.close();
    }
}