package model.requisicoes;

public class RequisicaoXRP extends RequisicaoHttp {

	@Override
	public String consultarValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "buy");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do XRP");
		}
	}

	@Override
	public String maiorValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "higi");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do XRP");
		}
	}

	@Override
	public String menorValor(String moeda) throws Exception {
		try {
			return (String) super.request(moeda, "low");
		} catch (Exception e) {
			throw new Exception("Erro ao consultar valor do XRP");
		}
	}

}
