package subsistema2.cep;

public class cepAPI {
	private static cepAPI instancia = new cepAPI();
	
	private cepAPI() {
		super();
	}

	public static cepAPI getinstancia() {
		return instancia;
		}
	
	public String recuperarCidade(int cep) {
		return "Uberlandia";
		
	}

	public String recuperarEstado(int cep) {
		return "MG";
		
	}
}
