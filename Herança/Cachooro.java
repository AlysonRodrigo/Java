package JavaPart2;

public class Cachooro extends Animal {

	private boolean corre;
	
	public Cachooro (String nome, int idade,boolean som, boolean corre)
	{
		super(nome,idade,som);
		this.corre = corre;
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	public void anda()
	{
		if (isCorre()==true)
		{
			System.out.println("Sim Consegue Correr");
		}
		else
		{
			System.out.println("Não Consegue Correr");
		}
	}
	public void impr()
	{
		System.out.println("O Cachorro "+getNome()+ " tem "+getIdade() + " anos \n e emite som "+ isSom()
		+ " e ele corre "+isCorre());
	}
}