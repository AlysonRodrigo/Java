package Turma29;
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
import java.util.Scanner;
public class ExRepPar2Ex6 {

	public static void main(String[] args) {
		int num,div=0,media,tot=0;

		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		num=leia.nextInt();
		do
		{
			if(num%3==0)
			{
				tot++;
				div+=num;
			}
			System.out.println("Entre com outro numero: ");
			num=leia.nextInt();
		}
		while(num!=0);
		media =div/tot;
		System.out.println("Media dos numeros é: "+media);
		
	}
	

}
