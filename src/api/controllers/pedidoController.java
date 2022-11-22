package api.controllers;


import javafx.scene.control.TableView;
import api.dto.pedidoDTO;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import model.entities.Pedido;
import view.Telas;

public class pedidoController {
	
	@FXML 
	private TableColumn<pedidoDTO, String> columnPedido;
	@FXML 
	private TableColumn<pedidoDTO, String> columnID;
	@FXML 
	private TableColumn<pedidoDTO, String> columnCliente;
	
	@FXML
	private TableView<Pedido> listarPedidoTable;

	@FXML
	public void adicionarPedido() {

	}
	
	@FXML
	public void adicionarCliente() {
		Telas.telaCadastroClientes();
	}

	@FXML
	public void alterar() {

	}

	@FXML
	public void deletar() {

	}

	public void voltar() {
		Telas.telaHome();
	}

	@FXML
	public void listar() {

	}

}
