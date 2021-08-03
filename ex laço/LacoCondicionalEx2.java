package Turma29;

import java.util.Scanner;

public class LacoCondicionalEx2 {

	public static void main(String[] args) {
		int a,b,c,i,j,k;
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Escreva primeiro numero ");
		a=leia.nextInt();
		System.out.println("Escreva segundo numero ");
		b=leia.nextInt();
		System.out.println("Escreva terceiro numero ");
		c=leia.nextInt();
		if (a<b && a<c)
		{
			System.out.println("valor "+a+ " menor numero");
		}
		if (b<a && b<c)
		{
			System.out.println("valor "+b+ " menor numero");
		}
		if (c<a && c<b)
		{
			System.out.println("valor "+c+ " menor numero");
		}
		if (a<b && a>c)
		{
			System.out.println("valor "+a+ " numero do meio");
		}
		if (b<a && b>c)
		{
			System.out.println("valor "+b+ " numero do meio");
		}
		if (c<a && c>b)
		{
			System.out.println("valor "+c+ " numero do meio");
		}
		if (a>b && a>c)
		{
			System.out.println("valor "+a+ " maior numero");
		}
		if (b>a && b>c)
		{
			System.out.println("valor "+b+ " maior numero");
		}
		if (c>a && c>b)
		{
			System.out.println("valor "+c+ " maior numero");
		}
		
	}

}
