package Turma29;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double x1,x2,y1,y2,d;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Valor de X1: ");
		x1= ler.nextDouble();
		System.out.println("Valor de X2: ");
		x2= ler.nextDouble();
		System.out.println("Valor de Y1: ");
		y1= ler.nextDouble();
		System.out.println("Valor de Y2: ");
		y2= ler.nextDouble();
		
		d = Math.sqrt(Math.pow((y2 -y1),2)+Math.pow((x2-x1),2));
		System.out.printf("Adistancia é: %.2f",d);
		
	}

}
