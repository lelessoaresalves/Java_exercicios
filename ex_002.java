/*
	Exercício 002
	
	2. Write a Java program to print the sum of two numbers. Go to the editor
	Test Data:
	74 + 36
	Expected Output :
	110

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_002
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 002\n\nDigite o primeiro numero: ");
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = teclado.nextInt();
		System.out.println("\n " + n1 + " + " + n2 + " = " + (n1+n2));
		System.out.println("\n\nFim.");
	}
}