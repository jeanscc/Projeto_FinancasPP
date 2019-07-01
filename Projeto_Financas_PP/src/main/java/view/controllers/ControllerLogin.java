package view.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import control.ControlerUsuario;
import dto.UsuarioDTO;
import factory.FactoryUsuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ControllerLogin implements Initializable {
	private ControlerUsuario controlerUs;
	private FactoryUsuario fabricaUsuario;

	public ControllerLogin() {
		controlerUs = new ControlerUsuario();
		fabricaUsuario = new FactoryUsuario();
	}

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
		((Button) event.getPickResult().getIntersectedNode()).setCursor(Cursor.HAND);
		;

	}

	@FXML
	void lsForgot(ActionEvent event) {

	}

	@FXML
	void lsLogin(ActionEvent event) {
		try {
			UsuarioDTO usuario = (UsuarioDTO) fabricaUsuario.gerar("dto");
			// Pegando os dados digitado pelo usuário.
			String email = txEmail.getText();
			String senha = txSenha.getText();
			if (email.equalsIgnoreCase("admin@admin.com") && senha.equalsIgnoreCase("admin")) {
				this.novaTela("TelaInicial");
				
			} else {
				// populando o objeto DTO.
				usuario.setEmail(email);
				usuario.setSenha(senha);

				if (controlerUs.buscar(usuario) != null) {

				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao logar.  " + e.getMessage());
		}
	}

	public void initialize(URL location, ResourceBundle resources) {
		txEmail.setStyle("-fx-text-fill: lightgray; -fx-font-size: 12px;-fx-background-color:#14173d;");
		txSenha.setStyle("-fx-text-fill: lightgray; -fx-font-size: 12px;-fx-background-color:#14173d;");

	}

	private void novaTela(String tela) {
		try {
			Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/view/fxmls/" + tela + ".fxml"));
			Scene scene = new Scene(root);

			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao iniciar FXML.");
		}

	}
}
