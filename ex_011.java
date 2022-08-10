/*
	Exercício 011	
	
	11. Write a Java program to print the area and perimeter of a circle. Go to the editor
	Test Data:
	Radius = 7.5
	Expected Output
	Perimeter is = 47.12388980384689
	Area is = 176.71458676442586

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;
import java.lang.Math.*;

public class ex_011
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 011\n\nDigite o valor do raio: ");
		Scanner teclado = new Scanner(System.in);
		double r, area, perimetro;
		
		r = teclado.nextDouble();
	
		area 	  = Math.PI * Math.pow(r, 2);
		perimetro = 2 * Math.PI * r;
		
		System.out.println("Area      = " + area);
		System.out.println("Perimetro = " + perimetro);

		System.out.println("\n\nFim.");
	}
}