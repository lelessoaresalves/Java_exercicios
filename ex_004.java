/*
	Exercício 004
	
	4. Write a Java program to print the result of the following operations. Go to the editor
	Test Data:
	a. -5 + 8 * 6
	b. (55+9) % 9
	c. 20 + -3*5 / 8
	d. 5 + 15 / 3 * 2 - 8 % 3
	Expected Output :
	43
	1
	19
	13

	https://www.w3resource.com/java-exercises/basic/index.php
*/

public class ex_004
{
	public static void main(String[] args)
	{
		System.out.println("Exercício 004\n\n");
		
		System.out.println("a. -5 + 8 * 6 	\t  = " + (-5 + 8 * 6));
		System.out.println("b. (55+9) % 9 	\t  = " + (55+9) % 9);
		System.out.println("c. 20 + -3*5 / 8\t  = " + (20 + -3*5 / 8));
		System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
		
		System.out.println("\n\nFim.");
	}
}