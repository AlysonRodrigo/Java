package JavaPart2;

import java.util.Scanner;

public class AnimalsTest {

	public static void main(String[] args) {
		Cachorro cachorro =new Cachorro(null,null,null,null);
		Cavalo1 cavalo = new Cavalo1(null,null,null);
		Preguica1 preguica = new Preguica1(null,null,null);
		Animals animal =null;
		int n ;
		Scanner l = new Scanner(System.in);
		System.out.println("Valor de N");
		n=l.nextInt();
		switch(n) 
		{
		case 0: 
			animal = cachorro;
			
			break;
		case 1: 
			animal = cavalo;break;
		case 2: 
			animal = preguica;break;
			
		default: System.out.println("\nErro inesperado...");
		}
		animal.setNome(l.next());
		System.out.println(animal.getNome());
		animal.setRaca(l.next());
		System.out.println(animal.getRaca());
		
	}
}
