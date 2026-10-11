package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 
{
	public static void main(String[] args) 
	{
//		5. Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
//		Para ello, el usuario debe introducir el radio,
//		que puede contener decimales. Usa Math.PI para tomar el valor de PI. 
//		(longitud = 2πr, área=πr2)
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the radio of a circumference");
		Double radio = sc.nextDouble();
		Double lenght = 2*Math.PI*radio;
		Double area = Math.PI*radio*2;
		System.out.println("The lenght of your circumference is " + lenght + " and the area  " + area);
		sc.close();

	}
}
