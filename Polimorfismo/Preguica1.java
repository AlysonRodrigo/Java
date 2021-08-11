package JavaPart2;

public class Preguica1 extends Animals {
		public String arvore;
		public Preguica1 (String raca, String nome, String arvore)
		{
			super (raca,nome);
			this.arvore = arvore;
		}

		public String getArvore() 
		{
			if (getArvore()=="nao")
			{
				System.out.println("Leva ele para uma ong se ficar ai ele vai morrer de fome");
			}
			else
				{
					System.out.println("deixa o bichinho comer em paz");
				}
			return arvore;
		}

		public void setArvore(String arvore) {
			this.arvore = arvore;
		}
		@Override
		public void idade(int yers) 
		{
			if (yers >= 0 && yers <=15)
			{
				System.out.println("Novinho");
			}
			else if(yers > 15 && yers <= 45)
			{
				System.out.println("Ainda é jovem");
			}
			else if (yers >45 && yers <50)
			{
				System.out.println("Ja esta Velhinho");
			}
			else 
			{
				System.out.println("idade invalida ");
			}
		}
		@Override
		public void song(String sons)
		{
			if (sons =="Sim")
			{
				System.out.println("eeebaa  o bicho preguiça consegue se defender");
			}
			else 
			{
				System.out.println("Tadinhoo ele esta correndo perigo");
			}
		}
}
