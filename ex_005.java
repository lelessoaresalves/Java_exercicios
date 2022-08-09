/*
	Exercício 005
	
	5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
	Test Data:
	Input first number: 25
	Input second number: 5
	Expected Output :
	25 x 5 = 125

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_005
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 005\n\nDigite o primeiro numero: ");
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = teclado.nextInt();
		
		System.out.println("\n " + n1 + " * " + n2 + " = " + (n1*n2));
		System.out.println("\n\nFim.");
	}
}