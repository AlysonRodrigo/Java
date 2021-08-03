package Turma29;

import java.util.Scanner;

public class LacoCondicionalex1 {

	public static void main(String[] args) {
		int a, m=0;
		Scanner ler = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Entre com o numero: ");
			a=ler.nextInt();
			if (m<a )
				{
				m=a;
				}
		}
		System.out.println("Maior valor: " + m);
		

	}

}
