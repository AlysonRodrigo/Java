package Turma29;

import java.util.Scanner;

public class LacoCondicionalEx3 {

	public static void main(String[] args) {
		int a;
		Scanner le = new Scanner(System.in);
		System.out.println("Entre com sua idade ");
		a=le.nextInt();

		if (a>=18 && a<=25)
		{
			System.out.println(a+" Adulto");
		}
		else if (a>=15 && a<=17)
		{
			System.out.println(a+" Juvenil");
		}

		else 
		{
			System.out.println(" Idade invalido");
		}
	}

}
