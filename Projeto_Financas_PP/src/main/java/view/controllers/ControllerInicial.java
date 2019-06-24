package view.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.Pane;

public class ControllerInicial implements Initializable{

    @FXML
    private Pane pnlInvestimentos;

    @FXML
    private ProgressIndicator pgMetas;

    @FXML
    private LineChart<?, ?> charL;

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
