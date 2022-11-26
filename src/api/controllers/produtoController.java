package api.controllers;



import model.Services.ProdutoBO;
import model.entities.Produto;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import view.Telas;

public class produtoController implements Initializable {

	@FXML private TextField id;
	@FXML private TextField nome;
	@FXML private TextField preco;
	@FXML private TextField quantidade;

	@FXML
	private TableColumn<Produto, String> columnNome;
	@FXML
	private TableColumn<Produto, String> columnID;
	@FXML
	private TableColumn<Produto, String> columnQuantidade;

	@FXML
	private TableView<Produto> listarProdutosTable;
	
	@FXML
	private ObservableList<Produto> listaDeProdutos;

	private ProdutoBO produtoBo = new ProdutoBO();
	private Produto produto = new Produto();

	@FXML
	public void adicionarProduto() {
		produto.setId(id.getText());
		produto.setNome(nome.getText());
		produto.setPreco(Double.parseDouble(preco.getText()));
		produto.setQuantidade(Integer.parseInt(quantidade.getText()));
		if (produtoBo.adicionar(produto)) {
			System.out.println("Produto criado com sucesso!");
		} else {
			System.out.println("Erro ao criar um produto");
		}
	}

	@FXML
	public void alterar() {
		produto.setId(id.getText());
		produto.setNome(nome.getText());
		produto.setPreco(Double.parseDouble(preco.getText()));
		produto.setQuantidade(Integer.parseInt(quantidade.getText()));
		produtoBo.alterar(produto);
		if (produtoBo.alterar(produto)) {
			System.out.println("Produto alterado com sucesso!");
		} else {
			System.out.println("Erro ao alterar um produto");
		}
	}

	@FXML
	public void deletar() {
		produto.setId(id.getText());
		produtoBo.deletar(produto);
		if (produtoBo.deletar(produto)) {
			System.out.println("Produto deletado com sucesso!");
		} else {
			System.out.println("Erro ao deletar um produto");
		}
	}

	public void voltar() {
		Telas.telaHomeGerente();
	}

	@FXML
	public void listar() {
		List<Produto> produtos = produtoBo.listar();
		listaDeProdutos = FXCollections.observableArrayList(produtos);
		columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
		columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		columnQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
		listarProdutosTable.setItems(listaDeProdutos);
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		listar();
	}

}
