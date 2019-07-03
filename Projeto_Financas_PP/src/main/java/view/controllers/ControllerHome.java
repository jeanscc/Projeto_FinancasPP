package view.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerHome implements Initializable {

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
	private CheckBox checkMes;

	@FXML
	private ComboBox<?> cbAno;

	@FXML
	private ComboBox<?> cbMes;

	@FXML
	private CheckBox checkDia;

	@FXML
	private ComboBox<?> cbDdia;
	@FXML
	private Pane pnlConsultas;

	@FXML
	void handleClicks(ActionEvent event) {
		if (event.getSource() == btInicio) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("TelaInicial.fxml"));
				pnlHome.getChildren().add(pane);
				pnlHome.toFront();
			} catch (IOException e5) {
				e5.printStackTrace();
			}
		} else if (event.getSource() == btFinancas) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("Financas.fxml"));
				pnlFinancas.getChildren().add(pane);
				pnlFinancas.toFront();
			} catch (IOException e4) {
				// TODO Auto-generated catch block
				e4.printStackTrace();
			}
		} else if (event.getSource() == btMetas) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("Metas.fxml"));
				pnlMetas.getChildren().add(pane);
				pnlMetas.toFront();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
		} else if (event.getSource() == btConsultas) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("Consultas.fxml"));
				pnlConsultas.getChildren().add(pane);
				pnlConsultas.toFront();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		} else if (event.getSource() == btInicio) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("TelaInicial.fxml"));
				pnlHome.getChildren().add(pane);
				pnlHome.toFront();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (event.getSource() == btPerfil) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("/view/fxmls/Perfil.fxml"));
				pnlPerfil.getChildren().add(pane);
				pnlPerfil.toFront();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} else if (event.getSource() == btInvestimentos)
			pnlInvestimentos.toFront();
		else if (event.getSource() == btDeslogar) {
			System.exit(0);
		}
	}

	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
