package Turma29;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

		int ano,mes,dia,total;
		Scanner leia = new Scanner(System.in);
		System.out.println("Anos: ");
		ano = leia.nextInt();
		System.out.println("Mes: ");
		mes = leia.nextInt();
		System.out.println("dias: ");
		dia = leia.nextInt();
		total = (ano* 365)+(mes*30)+dia;
		System.out.println("Voce tem "+total+" dias de vida");
		
		
	}

}
