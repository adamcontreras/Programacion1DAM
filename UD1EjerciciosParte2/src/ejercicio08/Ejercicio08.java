package ejercicio08;

import java.util.Scanner;

public class Ejercicio08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de productos ");
        Integer numProductos = sc.nextInt();
        System.out.print("Introduce la capacidad de cada caja ");
        Integer capacidadCaja = sc.nextInt();
        Integer cajasNecesarias = (int) Math.ceil((double) numProductos / capacidadCaja);
        System.out.println("Cajas necesarias " + cajasNecesarias);
        sc.close();
    }
}