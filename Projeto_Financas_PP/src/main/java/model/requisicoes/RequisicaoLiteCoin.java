package model.requisicoes;

public class RequisicaoLiteCoin extends RequisicaoHttp{

	@Override
	public String consultarValor(String moeda) throws Exception {
		return (String) super.request("LTC", "vol");
	}

	@Override
	public String maiorValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "high");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do LiteCoin");
		}
	}

	@Override
	public String menorValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "low");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do Litecoin");
		}
	}

}
