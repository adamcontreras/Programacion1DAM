package test;

import ejercicios.Ejercicios;

public class TestEjercicios 
{

    public static void main(String[] args) 
    {
// Ejercicio 1
  	System.out.println("\n--Ejercicio 1--");
  	System.out.println("El precio de tu entrada es " + Ejercicios.precioEntrada(10, "SABADO", true));
  	System.out.println("El precio de tu entrada es " + Ejercicios.precioEntrada(35, "LUNES", false));
  	System.out.println("El precio de tu entrada es " + Ejercicios.precioEntrada(66, "VIERNES", true));
//Ejercicio 2
  	System.out.println("\n--Ejercicio 2--");
  	Ejercicios.dibujarZ(5);	
//Ejercicio 3
  	System.out.println("\n--Ejercicio 3--");
  	System.out.println(Ejercicios.sumaPrimerosEspeciales(5, 15, 23));
  //Ejercicio 4
  	System.out.println("\n--Ejercicio 4--");
//  	System.out.println(Ejercicios.contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2));
    	
    	
    }
}