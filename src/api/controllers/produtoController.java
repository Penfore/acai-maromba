package api.controllers;



import model.Services.ProdutoBO;
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

	private ProdutoBO produtoBo = new ProdutoBO();
	private Produto produto = new Produto();

	@FXML
	public void adicionarProduto() {
		produto.setNome(nome.getText());
		produto.setPreco(preco.getText());
		produto.adicional.setNome(adicional.getText());
		if (produtoBo.adicionar(produto)) {
			System.out.println("Produto criado com sucesso!");
		} else {
			System.out.println("Erro ao criar um produto");
		}
	}

	@FXML
	public void alterar() {
		produto.setNome(nome.getText());
		produto.setPreco(preco.getText());
		produto.adicional.setNome(adicional.getText());
		if (produtoBo.adicionar(produto)) {
			System.out.println("Produto alterado com sucesso!");
		} else {
			System.out.println("Erro ao alterar um produto");
		}
	}

	@FXML
	public void deletar() {
		if (produtoBo.deletar(nome.getText())) {
			System.out.println("Produto deletado com sucesso!");
		} else {
			System.out.println("Erro ao deletar um produto");
		}
	}

	public void voltar() {
		Telas.telaHome();
	}

	@FXML
	public void listar() {

	}

}
