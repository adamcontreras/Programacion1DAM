package ejercicio03;

import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args)
    {
        final Double DESCUENTO = 0.15;
        final Double IVA = 0.21;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio inicial ");
        Double precioInicial = sc.nextDouble();
        Double precioConDescuento = precioInicial * (1.0 - DESCUENTO);
        Double precioFinal = precioConDescuento * (1.0 + IVA);
        Double precioRedondeado = Math.round(precioFinal * 100.0) / 100.0;
        System.out.println("Precio final con descuento e IVA " + precioRedondeado + " euros");
        sc.close();
    }
}