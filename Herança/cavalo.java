package JavaPart2;

public class cavalo extends Animal{
	public boolean corre;
	public String pulo;
	
	public cavalo (String nome, int idade,boolean som, boolean corre, String pulo)
	{
		super(nome,idade,som);
		this.corre = corre;
		this.pulo = pulo;
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	public String getPulo() {
		return pulo;
	}

	public void setPulo(String pulo) {
		this.pulo = pulo;
	}
	public void anda()
	{
		if (isCorre()==true)
		{
			System.out.println("Consegue Correr");
		}
		else
		{
			System.out.println("Não Consegue Correr");
		}
	}
	public void impr()
	{
		System.out.println("O Cavalo "+getNome()+ " tem "+getIdade() + " anos \n emite som "+ isSom()
		+ " e ele corre "+isCorre()+ " Pula "+getPulo());
	}
}
