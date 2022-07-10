package one.digitalinnovation.gof.facade;

import subsistema1.crm.crmService;
import subsistema2.cep.cepAPI;

public class facade {
	
	public void migrarCliente(String nome, int cep) {
		String cidade = cepAPI.getinstancia().recuperarCidade(cep);
		String estado = cepAPI.getinstancia().recuperarEstado(cep);
		
		crmService.gravarCliente(nome, cep, cidade, estado);

}

}
