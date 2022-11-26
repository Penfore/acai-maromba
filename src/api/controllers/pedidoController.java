package api.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Services.PedidoBO;
import model.entities.Pedido;
import view.Telas;

public class pedidoController implements Initializable {

	@FXML
	private TextField cliente;
	@FXML
	private TextField produto;
	@FXML
	private TextField quantidade;
	@FXML
	private TextField data;
	@FXML
	private TextField formaPagamento;
	
	@FXML
	private TextField buscar;
	@FXML
	private TextField deletar;

	@FXML
	private TableColumn<Pedido, String> columnProduto;
	@FXML
	private TableColumn<Pedido, String> columnCliente;

	@FXML
	private TableView<Pedido> listarPedidoTable;
	@FXML
	private ObservableList<Pedido> listaDePedidos;

	private PedidoBO pedidoBo = new PedidoBO();
	private Pedido pedido = new Pedido();
	
	@FXML
	public void listar() {
		List<Pedido> pedidos = pedidoBo.listar();
		listaDePedidos = FXCollections.observableArrayList(pedidos);
		columnCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
		columnProduto.setCellValueFactory(new PropertyValueFactory<>("produto"));
		listarPedidoTable.setItems(listaDePedidos);
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		listar();
	}

	@FXML
	public void adicionarPedido() {
		pedido.setCliente(cliente.getText());
		pedido.setProduto(produto.getText());
		pedido.setQuantidade(Integer.parseInt(quantidade.getText()));
		pedido.setData(data.getText());
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
		pedido.setCliente(cliente.getText());
		pedido.setProduto(produto.getText());
		pedido.setQuantidade(Integer.parseInt(quantidade.getText()));
		pedido.setData(data.getText());
		pedido.setFormaPagamento(formaPagamento.getText());
		pedidoBo.alterar(pedido);
		if (pedidoBo.alterar(pedido)) {
			System.out.println("Pedio alterado com sucesso!");
		} else {
			System.out.println("Erro ao alterar um pedido");
		}
	}

	@FXML
	public void deletar() {
		pedido.setCliente(deletar.getText());
		pedidoBo.deletar(pedido);
		if (pedidoBo.deletar(pedido)) {
			System.out.println("Pedido deletado com sucesso!");
		} else {
			System.out.println("Erro ao deletar um pedido");
		}
	}
	
	public void buscar() {
		
	}

	public void voltar() {
		Telas.telaHome();
	}

}
