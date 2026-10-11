package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 
{
	public static void main(String[] args) 
	{
//		6. Escribir un programa que le pida dos números al usuario.
//		A continuación, debe mostrar la suma, la resta, la multiplicación y la división de ambos números.
//		Debe mostrarse el resultado de cada operación en una línea distinta.
		Scanner sc = new Scanner(System.in);
		System.out.println("Write 2 numbers");
		Integer num1,num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		Integer add,substract,multiply,divide;
		add = num1 + num2;
		substract = num1 - num2;
		multiply = num1 * num2;
		divide = num1 % num2;
		System.out.println("The result of adding, subtracting, multiplying, and dividing your numbers is ");
		System.out.println("Add =" + add);
		System.out.println("Substract =" + substract);
		System.out.println("Multiply =" + multiply);
		System.out.println("Divide =" + divide);
		sc.close();
	}
}
