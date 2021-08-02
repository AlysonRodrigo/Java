package Turma29;

import java.util.Scanner;

public class Exercico2 {

	public static void main(String[] args) {
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
		int dia, mes,ano,totaldia;
		Scanner leia = new Scanner(System.in);	
		System.out.println("Total de Dias: ");
		totaldia=leia.nextInt();
		ano=totaldia/365;
		mes = (totaldia%365)/30;
		dia= (totaldia%365)%30;
		System.out.println("Total de anos: "+ano +" mes:"+ mes+ " dias "+dia);
	}

}
