package view.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import control.ControlerMeta;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ControllerMetas implements Initializable{

    @FXML
    private Pane pnlInvestimentos;

    @FXML
    private ProgressIndicator pgMetas;

    @FXML
    private Label lbConcluido;

    @FXML
    private Label lbConcluir;

    @FXML
    private Label lbValor;

    @FXML
    private Label lbCancelados;

    @FXML
    private PieChart grResumo;

    @FXML
    private VBox pnItems111;

    @FXML
    private TextField txPesquisa;

    @FXML
    private TextField txNome;

    @FXML
    private TextField txDescricao;

    @FXML
    private TextField txValor11;

    @FXML
    private Button btCadastro;

	public void initialize(URL location, ResourceBundle resources) {
		ControlerMeta controler = new ControlerMeta();
		pgMetas= new ProgressIndicator();
		
	}

}

