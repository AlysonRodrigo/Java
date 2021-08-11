package JavaPart2;

public class Cachorro extends Animals {
	String run;
	String alimento;
	
	
	public Cachorro(String raca,String nome,String run,String alimento)
	{
		super (raca,nome);
		this.run =run;
		this.alimento = alimento;
	}
	@Override
	public void idade(int yers) 
	{
		if (yers >= 0 && yers <=5)
		{
			System.out.println("Filhote");
		}
		else if(yers > 5 && yers <= 10)
		{
			System.out.println("Ainda é jovem");
		}
		else if (yers >10 && yers <19)
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
			System.out.println("eeebaa seu cachorro conse latir");
		}
		else 
		{
			System.out.println("Tadinhoo");
		}
	}
	
	public String getRun() {
		if (getRun() == "Sim")
		{
			System.out.println("Ele consegue correr então brinque com ele");
		}
		else 
		{
			System.out.println("Não perturbe o doguinho");
		}
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getAlimento() {
		switch (getAlimento())
		{
		case "1":
			System.out.println("Estar correto continue assim");
			break;
		case "2":
			System.out.println("Não esta completamente serto mas melhor do que passar fome");
			break;
		case "3":
			System.out.println("Tenta dar alguma ração pra ele isso faz mal");
			break;
			default:
			System.out.println("Alimente seu doguinho ele esta com fome");
		}
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
}
