/*
	Exercício 006
	
	6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
	Test Data:
	Input first number: 125
	Input second number: 24
	Expected Output :
	125 + 24 = 149
	125 - 24 = 101
	125 x 24 = 3000
	125 / 24 = 5
	125 mod 24 = 5

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_006
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 006\n\nDigite o primeiro numero: ");
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = teclado.nextInt();
		
		System.out.println("\n " + n1 + " + " + n2 + " = " + (n1+n2));
		System.out.println("\n " + n1 + " - " + n2 + " = " + (n1-n2));
		System.out.println("\n " + n1 + " * " + n2 + " = " + (n1*n2));
		System.out.println("\n " + n1 + " / " + n2 + " = " + (n1/n2));
		System.out.println("\n " + n1 + " mod " + n2 + " = " + (n1%n2));
		
		System.out.println("\n\nFim.");
	}
}