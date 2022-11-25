package api.controllers;



import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import model.entities.Endereco;
import api.dto.clienteDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Services.ClienteBO;
import model.entities.Cliente;
import view.Telas;

public class clienteController {
	@FXML private TextField nome;
	@FXML private TextField telefone;
	@FXML private TextField pais;
	@FXML private TextField estado;
	@FXML private TextField cidade;
	@FXML private TextField logradouro;
	@FXML private TextField numero;
		private ObservableList<Cliente> listaDeClientes;

	@FXML
	private TableView<Cliente> listarTable;
	@FXML
	private TableColumn<Cliente, String> columnNome;
	@FXML
	private TableColumn<Cliente, String> columnTelefone;

	private ClienteBO clienteBo = new model.Services.ClienteBO();
	private Cliente cliente = new Cliente();
	private	Endereco endereco = new Endereco();

	@FXML
	public void adicionarCliente() {
		cliente.setNome(nome.getText());
		cliente.setTelefone(telefone.getText());
		endereco.setPais(pais.getText());
		endereco.setEstado(estado.getText());
		endereco.setCidade(cidade.getText());
		endereco.setLogradouro(logradouro.getText());
		endereco.setNumero(numero.getText());
		cliente.setEndereco(endereco);
		if (clienteBo.adicionar(cliente)) {
			System.out.println("Cliente criado com sucesso!");
		} else {
			System.out.println("Erro ao criar um cliente");
		}
	}


	// TODO: Implementar o restante na view
	@FXML
	public void deletar() {
		if (clienteBo.deletar(nome.getText())) {
			System.out.println("Cliente deletado com sucesso!");
		} else {
			System.out.println("Erro ao deletar um cliente");
		}
	}

	@FXML
	public void alterar() {
		cliente.setNome(nome.getText());
		cliente.setTelefone(telefone.getText());
		endereco.setPais(pais.getText());
		endereco.setEstado(estado.getText());
		endereco.setCidade(cidade.getText());
		endereco.setLogradouro(logradouro.getText());
		endereco.setNumero(numero.getText());
		cliente.setEndereco(endereco);
		if (clienteBo.alterar(cliente)) {
			System.out.println("Cliente alterado com sucesso!");
		} else {
			System.out.println("Erro ao alterar um cliente");
		}
	}

	public void voltar() {
		Telas.telaHome();
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		listar();
	}

	@FXML
	public void listar() {
		List<Cliente> clientes = clienteBo.listar();
		listaDeClientes = FXCollections.observableArrayList(clientes);
		columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		columnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		listarTable.setItems(listaDeClientes);
	}

}
