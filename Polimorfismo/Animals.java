package JavaPart2;

import java.util.Scanner;

public abstract class Animals {
		String raca;
		String nome;
		
		Scanner le = new Scanner(System.in);
		public abstract void idade(int idad);
		public abstract void song( String som);	
		
		Animals (String raca,String nome)
		{
			this.raca = raca;
			this.nome = nome;
		}
		public String getRaca() {
			return raca;
		}
		public void setRaca(String raca) 
		{
			this.raca = raca;
		}
		public String getNome() 
		{
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
}
