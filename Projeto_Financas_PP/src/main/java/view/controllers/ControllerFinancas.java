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
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ControllerFinancas implements Initializable{

	private CategoryAxis linhaX = new CategoryAxis();
	private NumberAxis linhaY = new NumberAxis();
	
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
    private BarChart<String, Number> grFinancas = new BarChart<>(linhaX,linhaY);

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
    	if(dateI.before(dateF) || dateF.after(dateI)) {
    		Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("Erro");
            dialogoErro.setHeaderText("Erro na Data");
            dialogoErro.setContentText("Selecione um Intervalo Válido");
            dialogoErro.showAndWait();
    		
    	}
    	else {
    	carregarData(dateI,dateF);
    	}
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
    	cbBalanco.setItems(registro);
    }
    
    private void carregarGrafico() {
    	//faltaFachada
    	XYChart.Series <String, Number> balanco = new XYChart.Series<>();
    	balanco.setName("Balanço Total");
    	XYChart.Series <String, Number> retorno = new XYChart.Series<>();
    	retorno.setName("Retorno Total");
    	XYChart.Series <String, Number> lucro = new XYChart.Series<>();
    	lucro.setName("Lucro Total");
    	XYChart.Series <String, Number> investido = new XYChart.Series<>();
    	investido.setName("Total Investido");
    	XYChart.Series <String, Number> pendentes = new XYChart.Series<>();
    	pendentes.setName("Investimentos Pendentes");
    	XYChart.Series <String, Number> percas = new XYChart.Series<>();
    	percas.setName("Percas");
    	//balanco.getData().add("Balanço",fachada.getBalanco);
    	//retorno.getData().add("Retorno",fachada.getRetorno);
    	//lucro.getData().add("Lucro",fachada.getLucro);
    	//investido.getData().add("Investido",fachada.getInvestido);
    	//pendentes.getData().add("Balanço",fachada.getBalanco);
    	
    	
    }
    
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		carregarCb();
		
	}

}
