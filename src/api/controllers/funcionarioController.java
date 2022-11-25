package api.controllers;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.dao.FuncionarioDao;
import model.Services.FuncionarioBO;
import model.entities.Funcionario;
import api.dto.funcionarioDTO;
import javafx.fxml.FXML;

import view.Telas;

public class funcionarioController {

	@FXML private TextField id;
	@FXML private TextField telefone;
	@FXML private TextField nome;
	@FXML private TextField cpf;

	@FXML
	private TableColumn<funcionarioDTO, String> columnNome;
	@FXML
	private TableColumn<funcionarioDTO, String> columnID;
	@FXML
	private TableColumn<funcionarioDTO, String> columnTelefone;

	// TODO: Criar entidade de Funcionario
	@FXML
	private TableView<Funcionario> listarFuncionarioTable;

	private FuncionarioBO funcionarioBo = new FuncionarioBO();
	private Funcionario funcionario = new Funcionario();

	@FXML
	public void listar() {

	}

	@FXML
	public void adicionarFuncionario() {
		funcionario.setNome(nome.getText());
		funcionario.setTelefone(telefone.getText());
		funcionario.setId(id.getText());
		funcionario.setCpf(cpf.getText());
		funcionarioBo.adicionar(funcionario);
		if (funcionarioBo.adicionar(funcionario)) {
			System.out.println("Funcionario criado com sucesso!");
		} else {
			System.out.println("Erro ao criar um funcionario");
		}
	}

	@FXML
	public void deletar() {
		if (funcionarioBo.deletar(cpf.getText())) {
			System.out.println("Funcionario deletado com sucesso!");
		} else {
			System.out.println("Erro ao deletar um cliente");
		}
	}

	@FXML
	public void alterar() {
		funcionario.setNome(nome.getText());
		funcionario.setTelefone(telefone.getText());
		funcionario.setId(id.getText());
		funcionario.setCpf(cpf.getText());
		funcionarioBo.adicionar(funcionario);
		if (funcionarioBo.adicionar(funcionario)) {
			System.out.println("Funcionario alterado com sucesso!");
		} else {
			System.out.println("Erro ao alterar um funcionario");
		}
	}

	public void voltar() {
		Telas.telaHomeGerente();
	}

}
