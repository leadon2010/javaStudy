package projectfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class BindingController implements Initializable {
	@FXML
	TextArea textArea1;
	@FXML
	TextArea textArea2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
	}

}
