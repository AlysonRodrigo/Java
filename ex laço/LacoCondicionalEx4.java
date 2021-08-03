package Turma29;

import java.util.Scanner;

public class LacoCondicionalEx4 {

	public static void main(String[] args) {
		int a;
		double p=0, i=0;
		Scanner li =new Scanner(System.in);
		System.out.println("Entre com um numero");
		a=li.nextInt();
		if (a % 2 == 0)
		{
			p = Math.sqrt(a);
			System.out.println("valor do numero é "+a+" A raiz dele é "+p);
		}
		else
		{
			i=Math.pow(a,2);

			System.out.println("valor do numero é "+a+" A potencia dele é "+i);
		}
	}

}
