package view.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import control.ControlerMeta;
import dto.MetaDTO;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
    
    public void carregarTabela() {
    	ControlerMeta controler = new ControlerMeta();
    	MetaDTO metas = new MetaDTO();
		try {
			metas = controler.listar();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	pnItems111.getChildren().clear();
		if(!metas.getTodasMetas().isEmpty()) {
			Node[] nodes = new Node[metas.getTodasMetas().size()];
			for (int i = 0; i < nodes.length; i++) {
	            try {

	                final int j = i;
	                FXMLLoader fxmlLoader = new FXMLLoader();
	                nodes[i] = fxmlLoader.load(getClass().getResource("/view/fxmls/ItemM.fxml").openStream());
	                ControllerItemM controller = (ControllerItemM) fxmlLoader.getController(); 
	                controller.setCon(this);
	                controller.carregar(metas.getTodasMetas().get(i));

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

	public void initialize(URL location, ResourceBundle resources) {
		ControlerMeta controler = new ControlerMeta();
		try {
			int atual = controler.metasFinalizadas();
			int total = controler.listar().getTodasMetas().size();
			double porcentagem = total*atual;
			pgMetas= new ProgressIndicator(porcentagem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

