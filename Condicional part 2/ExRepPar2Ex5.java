package Turma29;
import java.util.Scanner;
public class ExRepPar2Ex5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		int nume,soma=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		nume=leia.nextInt();
		do
		{
			soma+= nume;
			System.out.println("Entre com um numero que seja diferente de 0: ");
			nume=leia.nextInt();
		}
		while(nume!=0);
		System.out.println("total �: "+soma);
		
	}

}
