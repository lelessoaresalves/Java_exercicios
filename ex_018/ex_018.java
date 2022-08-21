/*
	Exercício 018
	
	18. Write a Java program to multiply two binary numbers. Go to the editor
	Input Data:
	Input the first binary number: 10
	Input the second binary number: 11
	Expected Output

	Product of two binary numbers: 110 
	 
	 https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_018
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Exercício 018\n\nDigite o valor para a variavel n1 em binario: ");
		String s1, strTotal;
		ex_018M bin = new ex_018M();
		int n1, n2;
		
		s1 = teclado.nextLine();
		
		n1 = bin.getDecimal(s1);
		
		System.out.println("Digite o valor para a variavel n2 em binario: ");
		s1 = teclado.nextLine();
		
		n2 = bin.getDecimal(s1);
		
		strTotal = bin.getBin(n1*n2);
		
		System.out.println("\n\n Total = " + strTotal);
		System.out.println("\n\nFim.");
	}
}
