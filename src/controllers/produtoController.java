package controllers;

import javax.swing.text.TableView;

import model.entities.Produto;
// import javafx.scene.control.TableView;
// import javafx.fxml.FXML;
// import javafx.scene.control.Button;
import view.Telas;

public class produtoController {
	@FXML
	private TableView<Produto> listarProdutosTable;
	@FXML
	private Button adicionarProdutoButton;
	@FXML
	private Button alterarProdutoButton;
	@FXML
	private Button deletarProdutoButton;

	@FXML
	public void adicionarProduto() {

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
