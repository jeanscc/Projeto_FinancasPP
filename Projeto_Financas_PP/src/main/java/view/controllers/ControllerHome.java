package view.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ControllerHome implements Initializable{

    @FXML
    private Label lbUsuario;

    @FXML
    private Button btInicio;

    @FXML
    private Button btFinancas;

    @FXML
    private Button btInvestimentos;

    @FXML
    private Button btMetas;

    @FXML
    private Button btConsultas;

    @FXML
    private Button btGraficos;

    @FXML
    private Button btPerfil;

    @FXML
    private Button btDeslogar;

    @FXML
    private Pane pnlHome;

    @FXML
    private Pane pnlFinancas;

    @FXML
    private Pane pnlGraficos;

    @FXML
    private Pane pnlPerfil;

    @FXML
    private Pane pnlMetas;

    @FXML
    private Pane pnlInvestimentos;

    @FXML
    private Label lbLucro;

    @FXML
    private Label lbGasto;

    @FXML
    private Label lbPendente;

    @FXML
    private Label lbCrescimento;

    @FXML
    private Label lbPerca;

    @FXML
    private Label lb;

    @FXML
    private VBox pnItems;

    @FXML
    private TextField txPesquisaH;

    @FXML
    private ComboBox<?> cbTtipo;

    @FXML
    private ComboBox<?> cbFonte;

    @FXML
    private DatePicker dtPicker;

    @FXML
    private TextField txValor;

    @FXML
    private Button btCadastro;

    @FXML
    private VBox pnItems111;

    @FXML
    private TextField txPesquisaG;

    @FXML
    private CheckBox checkAno;

    @FXML
    private Button btExcluir;

    @FXML
    private Button btEditar;

    @FXML
    private CheckBox checkMes;

    @FXML
    private ComboBox<?> cbAno;

    @FXML
    private ComboBox<?> cbMes;

    @FXML
    void handleClicks(ActionEvent event) {

    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
