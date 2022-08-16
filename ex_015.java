/*
	Exercício 015	
	
	15. Write a Java program to swap two variables. Go to the editor

	https://www.w3resource.com/java-exercises/basic/index.php
*/

import java.util.Scanner;

public class ex_015
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 015\n\nDigite o valor para a variavel v1: ");
		Scanner teclado = new Scanner(System.in);
		int v1, v2, vAux;
		
		v1 = teclado.nextInt();
		
		System.out.println("Digite o valor para a variavel v2: ");
		v2 = teclado.nextInt();
		
		vAux = v1;
		v1 = v2;
		v2 = vAux;
		
		System.out.println("\n Troca de valores");
		System.out.println(" v1 = " + v1);
		System.out.println(" v2 = " + v2);

		System.out.println("\n\nFim.");
	}
}