package dio.gof.facade;
import subsistema1.crm.CrmServices;
import subsistema2.cep.CepApi;


public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmServices.gravarCliente(nome, cep, cidade, estado);
	}
}
