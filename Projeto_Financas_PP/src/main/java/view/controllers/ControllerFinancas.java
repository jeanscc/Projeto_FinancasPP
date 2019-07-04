package view.controllers;

import java.net.URL;
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

    }

    @FXML
    void lsCb(ActionEvent event) {

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
