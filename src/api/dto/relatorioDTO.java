package api.dto;

public class relatorioDTO {

	private String dataInicial;
	private String dataFinal;
	private pedidoDTO Pedidos;
	
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public pedidoDTO getPedidos() {
		return Pedidos;
	}
	public void setPedidos(pedidoDTO pedidos) {
		Pedidos = pedidos;
	}
	
}
