package ejercicio11;

import java.util.Scanner;

public class Ejercicio11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad ");
        Integer edad = sc.nextInt();
        System.out.print("Tienes carnet de conducir? ");
        Boolean tienePermiso = sc.nextBoolean();
        System.out.print("Tienes alguna sancion que te impida conducir? ");
        Boolean tieneSancion = sc.nextBoolean();
        Boolean puedeAlquilar = (edad >= 18) && tienePermiso && !tieneSancion;
        System.out.println("Puede alquilar el vehiculo: " + puedeAlquilar);
        sc.close();
    }
}