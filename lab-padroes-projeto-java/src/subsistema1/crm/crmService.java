package subsistema1.crm;

public class crmService {
	
	private crmService() {
		super();
	}
	
	public static void gravarCliente(String nome, int cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM.");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	
}
	
}
