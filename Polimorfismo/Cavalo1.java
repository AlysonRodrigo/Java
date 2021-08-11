package JavaPart2;

public class Cavalo1 extends Animals{
	String run;
	
	
	public Cavalo1(String raca,String nome,String run)
	{
		super (raca,nome);
		this.run =run;
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
		else if (yers >45 && yers <60)
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
			System.out.println("eeebaa seu cavalo conse relinchar");
		}
		else 
		{
			System.out.println("Tadinhoo");
		}
	}
	public String getRun() {
		if (getRun() == "Sim")
		{
			System.out.println("Ele consegue correr então vá exercitar ele");
		}
		else 
		{
			System.out.println("Não perturbe o cavalinho");
		}
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
}
