package Turma29;

import java.util.Scanner;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class ExRepPar2Ex2 {

	public static void main(String[] args) {
		int par=0,impar=0,x;
		Scanner Cw=new Scanner(System.in);
		for(x=0;x<10;x++)
		{
			System.out.println("Entre com o valor: ");
			x=Cw.nextInt();
			if(x%2 ==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.println("Tem "+par+" numeros pares e "+impar+" impar");
	}
}
