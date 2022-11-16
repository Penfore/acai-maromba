package controllers;

import javax.swing.text.TableView;
// import javafx.scene.control.TableView;
// import javafx.fxml.FXML;
// import javafx.scene.control.Button;

import model.entities.Pedido;
import view.Telas;

public class pedidoController {
	@FXML
	private TableView<Pedido> listarPedidoTable;
	@FXML
	private Button adicionarPedido;
	@FXML
	private Button alterarPedidoButton;
	@FXML
	private Button deletarPedidoButton;

	@FXML
	public void adicionarPedido() {

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
