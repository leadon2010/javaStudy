package pfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BorderPaneController implements Initializable {
	@FXML
	private Button okBtn, cancelBtn, sendBtn;
	@FXML
	private TextArea txtDisplay;
	@FXML
	private TextField txtMsg;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		okBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				displayText("OK");
			}
		});

		cancelBtn.setOnAction(event -> {
			displayText("Cancel");
			Platform.exit();
		});

		sendBtn.setOnAction(event -> {
			displayText(txtMsg.getText());
			txtMsg.setText("");
		});

		txtMsg.setOnAction(event -> {
			System.out.println(event);
			displayText(txtMsg.getText());
			txtMsg.setText("");
		});
	}

	public void displayText(String message) {
		txtDisplay.appendText(message + "\n");
	}

}
