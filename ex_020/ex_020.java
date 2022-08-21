/*
	Exercício 020
	
	20. Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
	Input Data:
	Input a decimal number: 15
	Expected Output

	Hexadecimal number is : F  
	 
	 https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_020
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Exercício 020\n\nDigite o valor em decimal: ");
		ex_020M bin = new ex_020M();
		int nd;
		String nh;
		
		nd = teclado.nextInt();
		
		nh = bin.getHex(nd);
		
		System.out.println("\n\n Hexadecimal = " + nh);
		System.out.println("\n\nFim.");
	}
}
