/*
	Exercício 019
	
	19. Write a Java program to convert a decimal number to binary number. Go to the editor
	Input Data:
	Input a Decimal Number : 5
	Expected Output

	Binary number is: 101 
	 
	 https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_019
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Exercício 019\n\nDigite o valor em decimal: ");
		ex_019M bin = new ex_019M();
		int nd;
		String nb;
		
		nd = teclado.nextInt();
		
		nb = bin.getBin(nd);
		
		System.out.println("\n\n Binario = " + nb);
		System.out.println("\n\nFim.");
	}
}
