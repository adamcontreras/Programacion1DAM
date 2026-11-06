package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios 
{
	/* Un cine cobra 8 € de lunes a jueves, 10 € los viernes y 12 € los sábados y domingos.
Los menores de 12 años y las personas de 65 años o más obtienen 3 € de descuento.
Los socios obtienen otros 2 € de descuento. Los descuentos son acumulables.
Crea un método que reciba la edad, el día de la semana y si la persona es socia, y devuelva el precio final de la entrada. 
El día llega en mayúsculas y sin tildes (por ejemplo, MIERCOLES o SABADO). Si la edad es negativa o el día no existe, devuelve -1. 
Puedes considerar que los argumentos no son null.
Usa obligatoriamente switch para establecer el precio base e if para aplicar los descuentos. */
	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) 
	{
	Integer precio = 0;
	if (edad < 12 || edad >= 65) 
	{
		precio = precio - 3;
	}
	else if (socio = true) 
	{
		precio = precio - 2;
	}
		switch (dia)
		{
		case "LUNES":
			precio = 8;
			break;
		case "MARTES":
			precio = 8;
			break;
		case "MIERCOLES":
			precio = 8;
			break;
		case "JUEVES":
			precio = 8;
			break;
		case "VIERNES":
			precio = 10;
			break;
		case "SABADO":
			precio = 12;
			break;
		case "DOMINGO":
			precio = 12;
			break;
		default:
			System.out.println("Cerrado");
			System.exit(0);
			break;
		}
		Integer descuento = socio ? 2:0;
		if (edad < 0)
		{
		return -1;
		}
		if (edad < 12 || edad >= 65) 
		{
			descuento +=3;
		}
		return precio - descuento;
	}
	
	public static void dibujarZ(Integer lado)
	{
		lado = 5;
		
		for (Integer i = 0; i < lado; i++) //Bucle Filas
		{
			for (Integer j = 0; j < lado; j++) //Bucle Columnas
			{
				if (i == 0 || i == lado - 1 || j == lado - 1 - i ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	/*	
	Un número es especial si es primo o perfecto. Recibe un intervalo [inicio, fin] y una cantidad. 
	Recorre el intervalo de menor a mayor y devuelve la suma de los primeros 'cantidad' números especiales encontrados. Si un número cumple ambas condiciones, solo se suma una vez.
Puedes utilizar Utiles.esPrimo(Integer) y Utiles.esPerfecto(Integer), que ya están implementados.
Utiliza un bucle for con una condición if y termina el recorrido con break cuando hayas encontrado la cantidad solicitada. No utilices continue.
Si inicio es mayor que fin, si cantidad es 0 o negativa, o si no hay números especiales, devuelve 0. Si hay menos números especiales de los solicitados, suma todos los encontrados.
	 */
	public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer cantidad)
	{
		Integer res = 0;
		Integer contador = 0;
		for (int i = inicio; i <= fin; i++) 
		{
			if (Utiles.esPrimo(i) || Utiles.esPerfecto(i))
			res += i;
			contador++;
			if (contador >= cantidad) 
			{
				break;
			}
		}
		return res;
	}
	
	public static Integer factorialConSaltos(Integer numero, Integer salto)
	{
		Integer res = 1;
		if (numero <= 1) 
		{
			res = 1;
		}
		else 
		{
			res = numero * factorialConSaltos(numero-salto, salto);
		}
		return res;
	}
	
	public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima)
	{
//		contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2) → 3
		Integer contador = 0;
		for (int i = 1; i < alturas.size()-1 ; i++)
		{
			Integer e = alturas.get(1);
			Integer antes = alturas.get(i - 1);
			Integer despues = alturas.get(i+1);
			if (e > antes && e > despues);
			{
			contador++;
			
			}
		}
		return contador;
//		Integer e = altura.get(i)
//		Integer alturas = alturas.get(i + 1)
//		Integer alturas = alturas.get(i - 1)
	}
	public static Integer primeraPosicionSumaCifras(List<Integer> numeros, Integer sumaObjetivo)
	{
		Integer pos = -1;
		int i = 0;
		while (i < numeros.size())
		{
			if (Utiles.sumaCifras(numeros.get(i))==sumaObjetivo)
			{
				pos = i;
				break;
			}
			i++;
		}
		return pos;
	}
	public static Integer countNonOverlappingPairs(List<Integer> numbers)
	{
		Integer res = 0;
		for (int i = 0; i < numbers.size() - 1; i++) 
		{
			Integer element = numbers.get(i);
			Integer nextElement = numbers.get(i+1);
			if ((element + nextElement)%5 == 0);
			{
				res++;
				i++;
			}
		}
		return res;
	}
}