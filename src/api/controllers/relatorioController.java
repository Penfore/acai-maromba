package api.controllers;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import api.dto.relatorioDTO;
import javafx.fxml.FXML;

import model.entities.Relatorio;
import view.Telas;

public class relatorioController {
	
	@FXML 
	private TableColumn<relatorioDTO, String> columnDataInicial;
	@FXML 
	private TableColumn<relatorioDTO, String> columnDataFinal;
	@FXML 
	private TableColumn<relatorioDTO, String> columnPedidos;
	
	@FXML
	private TableView<Relatorio> listarRelatoriosTable;

	public void voltar() {
		Telas.telaHomeGerente();
	}

	@FXML
	public void listar() {

	}

}
