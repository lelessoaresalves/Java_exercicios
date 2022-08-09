/*
	Exercício 009
	
	9. Escreva um programa Java para calcular as expressões especificadas e imprimir a saída. Vá para o editor
	Dados de teste:
	((25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5))
	Saída esperada
	2,138888888888889
 
	https://www.w3resource.com/java-exercises/basic/index.php
*/

public class ex_009
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 009\n\n");

		System.out.print("((25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5)) = ");
		System.out.print( ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
		
		System.out.println("\n\nFim.");
	}
}