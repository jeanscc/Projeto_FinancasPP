package view.controllers;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
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
    private Label lbGastos;

    @FXML
    private CategoryAxis lnTemporal;

    @FXML
    private DatePicker dtFinal;

    @FXML
    private DatePicker dtInicial;

    @FXML
    private ComboBox<?> cbBalanco;

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
