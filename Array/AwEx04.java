package Turma29;

import java.util.Scanner;

public class AwEx04 {

	public static void main(String[] args) {
		int i,j,a,b;
		double m[][]=new double[2][2];
		double n[][]=new double[2][2];
		double p[][]=new double[2][2];
		Scanner l=new Scanner(System.in);
		System.out.println("Matriz 01");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("\nValor");
				m[i][j]=l.nextDouble();
			}
		}
		System.out.println("Matriz 02");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("\nValor");
				n[i][j]=l.nextDouble();
			}
		}
		System.out.println("\nEscolha uma opção ");
		System.out.println("(1) somar as duas matrizes ");
		System.out.println("(2) subtrair a primeira matriz da segunda ");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes ");
		a=l.nextInt();
		if(a==1)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					p[i][j]=m[i][j]+ n[i][j];
					System.out.println(p[i][j]);
				}
			}
		}
		if(a==2)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					p[i][j]=n[i][j] - m[i][j];
					System.out.println(p[i][j]);
				}
			}
		}
		if(a==3)
		{
			System.out.println("Valor da Constante: ");
			b=l.nextInt();
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					m[i][j]= m[i][j] + b;
					n[i][j]= n[i][j] + b;
					System.out.println("matriz 1 "+m[i][j]);
					System.out.println("matriz 2 "+n[i][j]);
				}
			}
		}
		if(a==4)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.println("\nMatriz 01 é"+m[i][j] );
					System.out.println("\nMatriz 02 é"+n[i][j] );
				}
			}
		}
		
	}
}
