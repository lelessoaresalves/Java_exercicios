/*
	Exercício 001
	1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
	Expected Output :
	Hello
	Alexandra Abramov

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_001
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 001\n\nDigite seu nome: ");
		
		String texto;
		Scanner teclado = new Scanner(System.in);
		
		texto = teclado.nextLine();
		
		System.out.println("\n\n Ola, " + texto + ":)");
		
		System.out.println("\n\nFim.");
	}
}