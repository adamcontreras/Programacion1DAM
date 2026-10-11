package ejercicio10;

import java.util.Scanner;

public class Ejercicio10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un anyo ");
        Integer anyo = sc.nextInt();
        Boolean esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
        System.out.println("El anyo " + anyo + " es bisiesto " + esBisiesto);
        sc.close();
    }
}