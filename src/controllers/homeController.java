package controllers;

import javax.swing.text.TableView;

// import javafx.scene.control.TableView;

import model.entities.Pedido;
import view.Telas;

public class homeController {
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
		// TODO: Implementar uma lista observable e settar no listarTable
		// ObservableList<Pedido> parsedPedidos = FXCollections.observableArrayList();
		// for(pedido) { // Será feito um map // TODO: Descobrir como fazer map em java
		// :v
		// parsedPedidos.add(pedido)
		// }
		listarTable.setItems(parsedPedidos);
	}
}
