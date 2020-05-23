package projectfx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class SampleController implements Initializable {

	@FXML
	Button btn1;
	@FXML
	Button btn2;
	@FXML
	Button btn3;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("btn1 click.");
			}
		});

		btn2.setOnAction(event -> System.out.println("btn2 click"));

		btn3.setOnAction(event -> System.out.println("btn3 click"));
	}

}
