/*
	Exercício 010
	
	10. Escreva um programa Java para calcular uma fórmula especificada. Vá para o editor
	Fórmula especificada:
	4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
	Saída esperada
	2.9760461760461765
 
	https://www.w3resource.com/java-exercises/basic/index.php
*/

public class ex_010
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 010\n\n");

		System.out.print("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) = ");
		System.out.print( 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) );
		
		System.out.println("\n\nFim.");
	}
}