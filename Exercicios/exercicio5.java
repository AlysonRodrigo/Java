package Turma29;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
		double n1,n2,n3, media;
		Scanner dig = new Scanner(System.in);
		System.out.println("Valor da primeira nota: ");
		n1 = dig.nextDouble();
		System.out.println("Valor da segunda nota: ");
		n2 = dig.nextDouble();
		System.out.println("Valor da terceira nota: ");
		n3 = dig.nextDouble();
		media =((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println("A media �: "+ media);
	}

}
