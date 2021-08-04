package Turma29;

import java.util.Scanner;

public class ExRepPar2Ex3 {

	public static void main(String[] args) {
		int idade,menor=0,maior=0;
		Scanner cw=new Scanner(System.in);
		System.out.println("Entre com a idade: ");
		idade=cw.nextInt();
		
		while(idade!=-99)
		{
			if (idade<=21)
			{
				menor++;
			}
			else if(idade>=50)
			{
				maior++;
			}
			else
			{
				System.out.println("Idade fora da pesquisa");
			}
			System.out.println("proximo idade se digitar -99 sai do loopin");
			idade=cw.nextInt();
		}
		System.out.println("Quantidade de pessoas menores que 21 é: "+menor+" e maiores que 50 anos é: "+maior);
		
	}

}
