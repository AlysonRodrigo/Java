package Turma29;

import java.util.Scanner;

public class Exercio8 {

	public static void main(String[] args) {
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
		double custo, vatotal;
		Scanner ler = new Scanner(System.in);
		System.out.println("Valor do Carro: ");
		custo=ler.nextDouble();
		vatotal = custo+(custo * 0.73);
		System.out.printf("Valor do Carro é: %.2f",vatotal);
		
	}

}
