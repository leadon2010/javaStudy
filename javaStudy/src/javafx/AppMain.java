package javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println("AppMain call");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start call");

		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);

		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));

		Button btn = new Button();
		btn.setText("확인");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
			}
		});

		root.getChildren().add(label);
		root.getChildren().add(btn);

		Scene scene = new Scene(root);

		primaryStage.setTitle("App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void init() throws Exception {
		System.out.println("init call");
	}

	@Override
	public void stop() throws Exception {
		System.out.println("stop call");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
