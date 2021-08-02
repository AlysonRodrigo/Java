package Turma29;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/
		int a, b, c;
		double r, s, d;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com Valor Inteiro");
		System.out.println("Valores de A: ");
		a = leia.nextInt();
		System.out.println("Valores de B: ");
		b = leia.nextInt();
		System.out.println("Valores de C: ");
		c = leia.nextInt();
		r= Math.pow((a + b),2);
		s= Math.pow((b + c),2);
		d= (r + s)/2;
		System.out.println("Valor de D é: "+d);
		
	}

}
