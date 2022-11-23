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
import model.dao.ClienteDao;
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
		  private ClienteDao dao = new ClienteDao();

		  private ObservableList<Cliente> listaDeClientes;
	
	@FXML
	private TableView<Cliente> listarTable;
	@FXML 
	private TableColumn<clienteDTO, String> columnNome;
	@FXML 
	private TableColumn<clienteDTO, String> columnTelefone;

	@FXML
	public void adicionarCliente() {
		Cliente clc = new Cliente();
		Endereco end = new Endereco();
		clc.setNome(nome.getText());
		clc.setTelefone(telefone.getText());
		end.setPais(pais.getText());
		end.setEstado(estado.getText());
		end.setCidade(cidade.getText());
		end.setLogradouro(logradouro.getText());
		end.setNumero(numero.getText());
		dao.adicionar(clc);
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
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		listar();
	}

	@FXML
	public void listar() {
		List<Cliente> clientes = dao.listar();
		listaDeClientes = FXCollections.observableArrayList(clientes);
		columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		columnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		listarTable.setItems(listaDeClientes);
	}

}
