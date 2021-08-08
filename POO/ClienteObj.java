package JavaPart2;

public class ClienteObj {

	public static void main(String[] args) {
		
		Cliente[] listaComp= new Cliente[2];
		listaComp[0] = new Cliente ("Charlen",50,"Ferro");
		listaComp[1] = new Cliente ("Julin",150,"Parafusos");
		
		 for(Cliente roda:listaComp) {
	            roda.impr();
	        }
		 System.out.println("-----------------");

	        for(Cliente rodar:listaComp) 
	        {
	            rodar.aumento(50);
	            rodar.impr();
	        }

	}
}
