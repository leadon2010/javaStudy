package javafx.ui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class AppUI implements AppServiceUI {
	@Override
	public String getTitle() {
		return "AppUI";
	}

	@Override
	public Scene showUI() {
		VBox root = new VBox();
		root.setPrefHeight(150);
		root.setPrefWidth(350);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);

		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("확인");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Platform.exit();
			}

		});

		root.getChildren().add(label);
		root.getChildren().add(button);
		Scene scene = new Scene(root);

		return scene;
	}

}
