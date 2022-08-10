/*
	Exercício 013	
	
	13. Write a Java program to print the area and perimeter of a rectangle.

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;
import java.lang.Math.*;

public class ex_013
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 013\n\nDigite o valor da largura: ");
		Scanner teclado = new Scanner(System.in);
		double l, c, area, perimetro;
		
		l = teclado.nextDouble();
		
		System.out.println("Digite o valor do comprimento: ");
		c = teclado.nextDouble();
	
		area 	  = l * c;
		perimetro = (2*l) + (2*c);
		
		System.out.println("\n Area      = " + area);
		System.out.println(" Perimetro = " + perimetro);

		System.out.println("\n\nFim.");
	}
}