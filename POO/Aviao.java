package JavaPart2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Aviao {
	private String cliente;
	public int assento;
	public Double valor;
	
	public Aviao()
	{
		this.setValor(0.00);
	}
	public void cadastraCliente(){
		System.out.println("Numero de vagas é de 00 ate 100");
	    Scanner input = new Scanner(System.in);
	    System.out.println("Qual sei nome? ");
	    this.setCliente(input.next());
	    System.out.println("Qual seu assento? ");
	    this.setAssento(input.nextInt());
	    System.out.println("O valor é: "+this.getValor());
	    
	}
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getAssento() {
		return assento;
	}
	
	public void setAssento(int assento) {
		this.assento = assento;
	}
	
	public Double getValor() {
		
		if (this.getAssento()<=12 && this.getAssento()>0)
		{
			valor= valor+1000.00;
		}
		else if(this.getAssento()>12 && this.getAssento()<=80)
		{
			valor= valor+500.00;	
		}
		else if(this.getAssento()>80 && this.getAssento()<=100)
		{
			valor=valor+100.0;
		}
		else
		{
			System.out.println("Assento não existe");
		}
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
}