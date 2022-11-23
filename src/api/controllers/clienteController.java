package api.controllers;



import api.dto.clienteDTO;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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

	}

}
