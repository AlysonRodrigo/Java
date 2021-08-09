package JavaPart2;

public class Preguica extends Animal{
		public boolean arvore;
		
		public Preguica (String nome, int idade,boolean som, boolean arvore)
		{
			super(nome,idade,som);
			this.arvore = arvore;
		}

		public boolean isArvore() {
			return arvore;
		}

		public void setArvore(boolean arvore) {
			this.arvore = arvore;
		}
		public void sobe()
		{
			if (isArvore()==true)
			{
				System.out.println("Consegue subir");
			}
			else
			{
				System.out.println("Não Consegue subir");
			}
		}
		public void impr()
		{
			System.out.println("O bicho Preguiça "+getNome()+ " tem "+getIdade() + " anos Emite som "+isSom() + "\n Consegue subir na Arvore "+isArvore());
		}
}
