/*
	Exercício 007
	
	7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
	Test Data:
	Input a number: 8
	Expected Output :
	8 x 1 = 8
	8 x 2 = 16
	8 x 3 = 24
	...
	8 x 10 = 80

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_007
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 007\n\nDigite o numero da tabuada: ");
		Scanner teclado = new Scanner(System.in);
		int n, i;
		
		n = teclado.nextInt();
		
		System.out.println("\n");
		
		for (i = 1; i <= 10; i++)
			System.out.println(" " + n + " * " + i + " = " + (n*i));
		
		System.out.println("\n\nFim.");
	}
}