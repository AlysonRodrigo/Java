package Turma29;

import java.util.Scanner;

public class AwEx02 {

	public static void main(String[] args) {
		int[] a=new int[6];
		int par=0,impar=0,somap=0,somai=0;
		Scanner l =new Scanner(System.in);
		for(int x=0;x<6;x++)
		{
			System.out.println("Entre com o valor ");
			a[x]=l.nextInt();
			if(a[x]%2==0)
			{
				somap+=a[x];
			}
			else
			{
				somai+=a[x];
			}
				
		}
		System.out.println("\nValores pares e sua soma ");
		for(int x=0;x<6;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
			}
		}
		System.out.println("\nAs somas de par");
				System.out.println(somap);
		System.out.println("\nValores impares ");
		for(int x=0;x<6;x++)
		{
			if(a[x]%2==1)
			{
				System.out.println(a[x]);
			}
		}
		System.out.println("\nAs somas de impar");
		
				System.out.println(somai);
	}

}
