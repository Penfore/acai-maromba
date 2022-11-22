package api.controllers;



import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import api.dto.pedidoDTO;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import model.entities.Pedido;
import view.Telas;

public class homeController {
	
	@FXML 
	private TableColumn<pedidoDTO, String> columnNome;
	@FXML 
	private TableColumn<pedidoDTO, String> columnID;
	@FXML 
	private TableColumn<pedidoDTO, String> columnCliente;
	@FXML
	private TableView<Pedido> listarTable;

	public void paraPedidos() {
		Telas.telaPedidos();
	}

	public void paraClientes() {
		Telas.telaClientes();
	}

	public void paraProdutos() {
		Telas.telaProdutos();
	}

	public void paraRelatorios() {
		Telas.telaRelatorios();
	}

	public void paraFuncionarios() {
		Telas.telaFuncionarios();
	}

	public void paraSair() {
		Telas.telaLogin();
	}

	@FXML
	public void listar() {
		ObservableList<Pedido> parsedPedidos = null;
		// TODO: Implementar uma lista observable e settar no listarTable
		// ObservableList<Pedido> parsedPedidos = FXCollections.observableArrayList();
		// for(pedido) { // Será feito um map // TODO: Descobrir como fazer map em java
		// :v
		// parsedPedidos.add(pedido)
		// }
		listarTable.setItems(parsedPedidos);
	}
}
