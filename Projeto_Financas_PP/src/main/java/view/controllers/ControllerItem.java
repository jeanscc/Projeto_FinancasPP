package view.controllers;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

import control.ControlerInvestimento;
import dto.InvestimentoDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ControllerItem implements Initializable{

	private ControllerHome con;
	
	private InvestimentoDTO dto;
	
    @FXML
    private HBox itemC;

    @FXML
    private Label lbNome;

    @FXML
    private Label lbDataI;

    @FXML
    private Label lbDataF;

    @FXML
    private Label lbValor;

    @FXML
    private Label lbLucro;

    @FXML
    private Label lbMargem;

    @FXML
    private Button btStatus;

    @FXML
    void lsExcluir(ActionEvent event) {
    	ControlerInvestimento controler = new ControlerInvestimento();
    //	controler.excluir(dto);
    	con.carregarTabela();
    }
    
    public void carregar (InvestimentoDTO i) {
    	dto=i;
    	SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
    	lbNome.setText(dto.getNome());
    	lbDataI.setText(s.format(dto.getData_inicio()));
    	lbDataF.setText(s.format(dto.getData_fim()));
    	lbLucro.setText(String.valueOf(dto.getLucro().get(0)));
    	lbMargem.setText(String.valueOf(dto.getMargem()));
    	lbValor.setText(String.valueOf(dto.getValor()));
    }

    

	public ControllerHome getCon() {
		return con;
	}





	public void setCon(ControllerHome con) {
		this.con = con;
	}





	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
