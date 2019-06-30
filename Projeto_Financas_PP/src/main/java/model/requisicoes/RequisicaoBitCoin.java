package model.requisicoes;

public class RequisicaoBitCoin extends RequisicaoHttp {

	@Override
	public String consultarValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "buy");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do Bitcoin");
		}
	}

	@Override
	public String maiorValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "high");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do Bitcoin");
		}
	}

	@Override
	public String menorValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "low");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do Bitcoin");
		}
	}

}
