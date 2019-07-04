package view.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dto.InvestimentoDTO;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;

import javafx.scene.control.ComboBox;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;



public class ControllerHome implements Initializable {

	@FXML
	private Label lbUsuario;

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
	private ComboBox<?> cbTtipo;

	@FXML
	private ComboBox<?> cbFonte;
	
	@FXML
    private TextField txNome;

	@FXML
	private TextField txValor;

	@FXML
	private Button btCadastro;

	@FXML
	private VBox pnItems111;

	@FXML
	private TextField txPesquisaG;

	
	@FXML
	private Pane pnlConsultas;

	@FXML
	void handleClicks(ActionEvent event) {
		if (event.getSource() == btFinancas) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("/view/fxmls/Financas.fxml"));
				pnlFinancas.getChildren().add(pane);
				pnlFinancas.toFront();
			} catch (IOException e4) {
				// TODO Auto-generated catch block
				e4.printStackTrace();
			}
		} else if (event.getSource() == btMetas) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("/view/fxmls/Metas.fxml"));
				pnlMetas.getChildren().add(pane);
				pnlMetas.toFront();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
		} else if (event.getSource() == btConsultas) {
			try {
				Pane pane = FXMLLoader.load(getClass().getResource("/view/fxmls/Consultas.fxml"));
				pnlConsultas.getChildren().add(pane);
				pnlConsultas.toFront();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		} 
		 else if (event.getSource() == btPerfil) {
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
	
	
	public void carregarTabela() {
		InvestimentoDTO investimentos = new InvestimentoDTO ();
		//Controller
		//investimentos =
		pnItems111.getChildren().clear();
		if(!investimentos.getTodosInvetismento().isEmpty()) {
			Node[] nodes = new Node[investimentos.getTodosInvetismento().size()];
			for (int i = 0; i < nodes.length; i++) {
	            try {

	                final int j = i;
	                FXMLLoader fxmlLoader = new FXMLLoader();
	                nodes[i] = fxmlLoader.load(getClass().getResource("/view/fxmls/Item.fxml").openStream());
	                ControllerItem controller = (ControllerItem) fxmlLoader.getController(); 
	                controller.setCon(this);
	                controller.carregar(investimentos.getTodosInvetismento().get(i));

	                //give the items some effect

	                nodes[i].setOnMouseEntered(event -> {
	                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
	                });
	                nodes[i].setOnMouseExited(event -> {
	                    nodes[j].setStyle("-fx-background-color : #02030A");
	                });
	                pnItems111.getChildren().add(nodes[i]);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		}
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarTabela();
	}

}
