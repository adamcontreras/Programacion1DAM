package ejercicio01;

import java.util.Scanner;

public class Ejercicio01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base del rectangulo ");
        Double base = sc.nextDouble();
        System.out.print("Introduce la altura del rectangulo ");
        Double altura = sc.nextDouble();
        Double perimetro = 2.0 * (base + altura);
        Double area = base * altura;
        System.out.println("Perimetro " + perimetro);
        System.out.println("Area " + area);
        sc.close();
    }
}