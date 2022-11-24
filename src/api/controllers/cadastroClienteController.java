package api.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.entities.Cliente;
import model.entities.Endereco;
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

	public void voltar() {
		Telas.telaPedidos();
	}

}
