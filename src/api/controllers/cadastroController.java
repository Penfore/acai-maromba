package api.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Services.FuncionarioBO;
import model.entities.Funcionario;
import view.Telas;

public class cadastroController {
	
	@FXML private TextField telefone;
	@FXML private TextField nome;
	@FXML private TextField cpf;
	
	private FuncionarioBO funcionarioBo = new FuncionarioBO();
	private Funcionario funcionario = new Funcionario();
	
	@FXML
	public void adicionarFuncionario() {
		funcionario.setNome(nome.getText());
		funcionario.setTelefone(telefone.getText());
		funcionario.setCpf(cpf.getText());
		funcionarioBo.adicionar(funcionario);
		if (funcionarioBo.adicionar(funcionario)) {
			System.out.println("Funcionario criado com sucesso!");
		} else {
			System.out.println("Erro ao criar um funcionario");
		}
	}

	public void voltar() {
		Telas.telaLogin();
	}
}
