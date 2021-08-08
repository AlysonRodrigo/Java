package JavaPart2;

import java.text.NumberFormat;

public class Cliente {
		private String nome;
		private double valor;
		private String material;
		
		public Cliente (String nome, double valor,String material)
		{
			 this.nome = nome;
			 this.valor = valor;
			 this.material = material;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}
		
		
		public void aumento(double porcento)
		{
			valor *= 1 - porcento/100;
		}
		public String mudarMoeda()
		{
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2); 
			String mudarMoeda = nf.format(valor);
	        return mudarMoeda;
		}
		public void impr()
		{
			System.out.println(nome+ "\n"+valor+"\n"+this.mudarMoeda());
		}
}
