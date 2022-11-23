package api.controllers;

import api.dto.clienteDTO;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Services.ClienteBO;
import view.Telas;

public class cadastroClienteController {
	
	@FXML private TextField nome;
	@FXML private TextField telefone;
	@FXML private TextField pais;
	@FXML private TextField estado;
	@FXML private TextField cidade;
	@FXML private TextField logradouro;
	@FXML private TextField numero;
		  private ClienteBO bo = new ClienteBO();
	
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
	
	public void voltar() {
		Telas.telaPedidos();
	}

}
