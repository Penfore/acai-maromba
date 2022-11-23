package api.controllers;



import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

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
		  private ClienteBO bo = new ClienteBO();

		  private ObservableList<Cliente> listaDeClientes;
	
	@FXML
	private TableView<Cliente> listarTable;
	@FXML 
	private TableColumn<clienteDTO, String> columnNome;
	@FXML 
	private TableColumn<clienteDTO, String> columnTelefone;

	@FXML
	public void adicionarCliente() {
		clienteDTO dto = new clienteDTO();
		dto.setNome(nome.getText());
		dto.setTelefone(telefone.getText());
		dto.setPais(pais.getText());
		dto.setEstado(estado.getText());
		dto.setCidade(cidade.getText());
		dto.setLogradouro(logradouro.getText());
		dto.setNumero(numero.getText());
		bo.adicionar(dto);
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		listar();
	}

	// TODO: Implementar o restante na view
	@FXML
	public void deletar() {

	}

	@FXML
	public void alterar() {

	}

	public void voltar() {
		Telas.telaHome();
	}

	@FXML
	public void listar() {
		List<Cliente> clientes = bo.listar();
		listaDeClientes = FXCollections.observableArrayList(clientes);
		columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		columnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		listarTable.setItems(listaDeClientes);
	}

}
