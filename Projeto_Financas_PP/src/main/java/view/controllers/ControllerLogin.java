package view.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerLogin implements Initializable{

	 	@FXML
	    private TextField txEmail;

	    @FXML
	    private PasswordField txSenha;

	    @FXML
	    private Button btLogin;

	    @FXML
	    private Button btCadastrar;

	    @FXML
	    private Button btForgot;

	    @FXML
	    void lsCadastro(ActionEvent event) {

	    }

	    @FXML
	    void lsExit(MouseEvent event) {
	    	Button b = (Button) event.getSource();
	    	b.setUnderline(false);
	    }

	    @FXML
	    void lsFocus(MouseEvent event) {
	    	
	    	((Button) event.getPickResult().getIntersectedNode()).setUnderline(true);
	    	((Button) event.getPickResult().getIntersectedNode()).setCursor(Cursor.HAND);;
	    	
	    }

	    @FXML
	    void lsForgot(ActionEvent event) {

	    }

	    @FXML
	    void lsLogin(ActionEvent event) {

	    }

		public void initialize(URL location, ResourceBundle resources) {
			txEmail.setStyle("-fx-text-fill: lightgray; -fx-font-size: 12px;-fx-background-color:#14173d;");
			txSenha.setStyle("-fx-text-fill: lightgray; -fx-font-size: 12px;-fx-background-color:#14173d;");
			
		}

}
