package view.controllers;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;

public class ControllerConsultas implements Initializable{

    @FXML
    private Pane pnlInvestimentos;

    @FXML
    private ComboBox<?> cbTipo;

    @FXML
    private ComboBox<?> cbInvestimento;

    @FXML
    private LineChart<?, ?> grConsulta;

    @FXML
    private Button btConsultar;

    @FXML
    void lsConsultar(ActionEvent event) {

    }

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
