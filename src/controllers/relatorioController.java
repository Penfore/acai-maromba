package controllers;

import javax.swing.text.TableView;
// import javafx.scene.control.TableView;
// import javafx.fxml.FXML;

import model.entities.Relatorio;
import view.Telas;

public class relatorioController {
	@FXML
	private TableView<Relatorio> listarRelatoriosTable;

	public void voltar() {
		Telas.telaHome();
	}

	@FXML
	public void listar() {

	}

}
