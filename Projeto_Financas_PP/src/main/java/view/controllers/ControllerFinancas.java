package view.controllers;

import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ControllerFinancas implements Initializable{

    @FXML
    private Pane pnlInvestimentos;

    @FXML
    private Label lbBalanco;

    @FXML
    private Label lbRetorno;

    @FXML
    private Label lbLucro;

    @FXML
    private Label lbInvestido;

    @FXML
    private Label lbPendentes;

    @FXML
    private Label lbPercas;

    @FXML
    private BarChart<Number, Number> grFinancas;

    @FXML
    private DatePicker dtFinal;

    @FXML
    private DatePicker dtInicial;

    @FXML
    private ComboBox<String> cbBalanco;

    @FXML
    private Button btBuscar;

    @FXML
    void lsBuscar(ActionEvent event) {
    	LocalDate localDate = dtInicial.getValue();
    	Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
    	Date dateI = Date.from(instant);
    	LocalDate localDate2 = dtInicial.getValue();
    	Instant instant2 = Instant.from(localDate2.atStartOfDay(ZoneId.systemDefault()));
    	Date dateF = Date.from(instant2);
    	
    	carregarData(dateI,dateF);
    }

    @FXML
    void lsCb(ActionEvent event) {
    	if(cbBalanco.getSelectionModel().getSelectedItem().equals("Geral")) {
    		carregarGeral();
    	}
    	else {
    		dtFinal.setVisible(true);
    		dtInicial.setVisible(true);
    		btBuscar.setVisible(true);
    	}
    }
    
    
    private void carregarGeral() {
    	//falta a fachada
    	dtFinal.setVisible(false);
		dtInicial.setVisible(false);
		btBuscar.setVisible(false);
		lbBalanco.setText(null);
		lbInvestido.setText(null);
		lbLucro.setText(null);
		lbPendentes.setText(null);
		lbPercas.setText(null);
		lbRetorno.setText(null);
		
		
    }
    
    private void carregarData(Date inicial,Date dFinal) {
		//falta fachada
    	lbBalanco.setText(null);
		lbInvestido.setText(null);
		lbLucro.setText(null);
		lbPendentes.setText(null);
		lbPercas.setText(null);
		lbRetorno.setText(null);
		
		
    }
    
    private void carregarCb() {
    	ObservableList <String> registro = FXCollections.observableArrayList();
    	registro.add("Geral");
    	registro.add("Intervalo de Datas");
    }
    
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		carregarCb();
		
	}

}
