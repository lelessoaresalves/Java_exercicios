/*
	Exercício 012	
	
	12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
	
	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_012
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 012\n\nDigite o primeiro numero: ");
		Scanner teclado = new Scanner(System.in);
		double n1, n2, n3, media;
		
		n1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		n2 = teclado.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		n3 = teclado.nextDouble();
	
		media = (n1 + n2 + n3) / 3;

		System.out.println("\n\n A media eh = " + media);
		
		System.out.println("\n\nFim.");
	}
}