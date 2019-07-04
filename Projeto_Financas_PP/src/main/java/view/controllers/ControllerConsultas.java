package view.controllers;
import javafx.fxml.Initializable;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import model.requisicoes.ITrequeste;
import model.requisicoes.RequisicaoBitCoin;
import model.requisicoes.RequisicaoDolar;

public class ControllerConsultas implements Initializable{
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
	private CategoryAxis linhaX = new CategoryAxis();
	private NumberAxis linhaY = new NumberAxis();
	private ScheduledExecutorService scheduledExecutorService;
	private ITrequeste consulta = new RequisicaoBitCoin();
	private Double num = new Double(0);
	
    @FXML
    private Pane pnlInvestimentos;

    @FXML
    private ComboBox<?> cbTipo;

    @FXML
    private ComboBox<?> cbInvestimento;

    @FXML
    private LineChart<String, Number> grConsulta = new LineChart<>(linhaX,linhaY);

    @FXML
    private Button btConsultar;
    
    @FXML
    private Button btParar;

    @FXML
    void lsParar(ActionEvent event) {
    	scheduledExecutorService.shutdownNow();
    }
    
    @FXML
    void lsConsultar(ActionEvent event) {
    	int var = 10;
    	
    	XYChart.Series<String, Number> series = new XYChart.Series<>();
    	series.setName("Testando");
    	grConsulta.getData().add(series);
    	
    	
    	// setup a scheduled executor to periodically put data into the chart
        
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        // put dummy data onto graph per second
        scheduledExecutorService.scheduleAtFixedRate(() -> {
			try {
				num = Double.parseDouble(consulta.consultarValor());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            // Update the chart
            Platform.runLater(() -> {
                // get current time
            Date now = new Date();
                // put random number with current time
              series.getData().add(new XYChart.Data<>(simpleDateFormat.format(now), num));
              if (series.getData().size() > var)
                  series.getData().remove(0);
            });
        }, 0, 1, TimeUnit.SECONDS);
    }

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
