package Turma29;

import java.util.Scanner;

public class AwEx03 {

	public static void main(String[] args) {
		int m[][]=new int[3][3];
		int soma=0;
		Scanner l =new Scanner(System.in);
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.println("\nEntre com o valor ");
				m[i][j]=l.nextInt();
				if(m[i][j]>10)
				{
					soma++;
				}
			}
		}
		System.out.println("\nTodos os valores maiores de 10 ");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				if(m[i][j]>10)
				{
					System.out.println(m[i][j]);
				}
			}
		}
		System.out.println("\nA quantidade: "+soma);
	}
}
