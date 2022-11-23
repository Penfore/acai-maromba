package api.controllers;



import model.entities.Produto;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import api.dto.produtoDTO;
import javafx.fxml.FXML;
import view.Telas;

public class produtoController {
	
	@FXML private TextField id;
	@FXML private TextField nome;
	@FXML private TextField preco;
	@FXML private TextField adicional;
	
	@FXML 
	private TableColumn<produtoDTO, String> columnNome;
	@FXML 
	private TableColumn<produtoDTO, String> columnID;
	@FXML 
	private TableColumn<produtoDTO, String> columnQuantidade;
	
	@FXML
	private TableView<Produto> listarProdutosTable;

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
