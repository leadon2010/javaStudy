package javafx.control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InputController implements Initializable {
	@FXML
	private TextField txtTitle;
	@FXML
	private PasswordField txtPassword;
	@FXML
	private ComboBox<String> comboPublic;
	@FXML
	private DatePicker dateExit;
	@FXML
	private TextArea txtContent;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void handleBtnRegAction() {
		String title = txtTitle.getText();
		System.out.println(title);
		
		System.out.println(txtPassword.getText());
		
		System.out.println(comboPublic.getValue());
		
		System.out.println(dateExit.getValue());
	}

	public void handleBtnCancelAction() {
		Platform.exit();
	}
}
