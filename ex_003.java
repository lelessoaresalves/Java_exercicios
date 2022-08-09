/*
	Exercício 003
	
	3. Write a Java program to divide two numbers and print on the screen. Go to the editor
	Test Data :
	50/3
	Expected Output :
	16

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_003
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 003\n\nDigite o primeiro numero: ");
		Scanner teclado = new Scanner(System.in);
		int n1, n2;
		
		n1 = teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = teclado.nextInt();
		
		System.out.println("\n " + n1 + " / " + n2 + " = " + (n1/n2));
		System.out.println("\n\nFim.");
	}
}