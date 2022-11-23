package api.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.dao.ClienteDao;
import model.entities.Cliente;
import model.entities.Endereco;
import view.Telas;

public class cadastroClienteController {
	
	@FXML private TextField nome;
	@FXML private TextField telefone;
	@FXML private TextField pais;
	@FXML private TextField estado;
	@FXML private TextField cidade;
	@FXML private TextField logradouro;
	@FXML private TextField numero;
		  private ClienteDao dao = new ClienteDao();
	
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
	
	public void voltar() {
		Telas.telaPedidos();
	}

}
