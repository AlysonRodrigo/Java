package Turma29;

import java.util.Scanner;

public class AwEx01 {

	public static void main(String[] args) {
		int[] a=new int[6];
		int soma=0,i=100;
				Scanner l =new Scanner(System.in);
				for(int x=0;x<6;x++)
				{
					System.out.println("Valor da Posição "+x);
					a[x]=l.nextInt();
					if (x==0 ||x==1 || x==5)
					{
						soma+= a[x];
					}
					if(x==4)
					{
						a[x]=i;
					}
					
				}
				System.out.println("\nSoma é "+soma);
				for(int x=0;x<6;x++)
				{
					if(x==0)
					{
						System.out.println("\nValores são:  ");
					}
					System.out.println(a[x]);
				}
	}

}
