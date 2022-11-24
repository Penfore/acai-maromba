package api.controllers;


import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import api.dto.pedidoDTO;
import model.Services.PedidoBO;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import model.entities.Pedido;
import view.Telas;

public class pedidoController {

	@FXML private TextField cliente;
	@FXML private TextField produto;
	@FXML private TextField adicional;
	@FXML private TextField quantidade;
	@FXML private TextField data;
	@FXML private TextField formaPagamento;

	@FXML
	private TableColumn<pedidoDTO, String> columnPedido;
	@FXML
	private TableColumn<pedidoDTO, String> columnID;
	@FXML
	private TableColumn<pedidoDTO, String> columnCliente;

	@FXML
	private TableView<Pedido> listarPedidoTable;

	private PedidoBO pedidoBo = new PedidoBO();
	private Pedido pedido = new Pedido();

	@FXML
	public void adicionarPedido() {
		pedido.cliente.setNome(cliente.getText());
		pedido.produto.setNome(produto.getText());
		pedido.adicional.setNome(adicional.getText());
		pedido.setQuantidade(quantidade.getText());
		pedido.setDataPedido(data.getText());
		pedido.setFormaPagamento(formaPagamento.getText());
		if (pedidoBo.adicionar(pedido)) {
			System.out.println("Pedio criado com sucesso!");
		} else {
			System.out.println("Erro ao criar um pedido");
		}
	}

	@FXML
	public void adicionarCliente() {
		Telas.telaCadastroClientes();
	}

	@FXML
	public void alterar() {
		pedido.cliente.setNome(cliente.getText());
		pedido.produto.setNome(produto.getText());
		pedido.adicional.setNome(adicional.getText());
		pedido.setQuantidade(quantidade.getText());
		pedido.setDataPedido(data.getText());
		pedido.setFormaPagamento(formaPagamento.getText());
		if (pedidoBo.adicionar(pedido)) {
			System.out.println("Pedio alterado com sucesso!");
		} else {
			System.out.println("Erro ao alterar um pedido");
		}
	}

	@FXML
	public void deletar() {
		if (pedidoBo.deletar(nome.getText())) {
			System.out.println("Pedido deletado com sucesso!");
		} else {
			System.out.println("Erro ao deletar um pedido");
		}
	}

	public void voltar() {
		Telas.telaHome();
	}

	@FXML
	public void listar() {

	}

}
