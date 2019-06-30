package model.requisicoes;

public interface ITrequeste {

	public Object request(String moeda, String tipoRetorno) throws Exception;

	public String consultarValor(String moeda) throws Exception;
	
	public String maiorValor(String moeda) throws Exception;
	
	public String menorValor(String moeda) throws Exception;
}
