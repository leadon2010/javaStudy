package javaFx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": main() 호출");
		launch(args);
	}

	public AppMain() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() 호출");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() 호출");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("AppMain");
		int showExam = 3;

		if (showExam == 0) {
			System.out.println("oh, no");

		} else if (showExam == 3) {
			Parent root = FXMLLoader.load(getClass().getResource("fxml/Circle.fxml"));
			Scene scene = new Scene(root);

			primaryStage.setScene(scene);

		} else if (showExam == 4) {
			HBox root = new HBox();
			root.setPrefSize(200, 50);
			root.setAlignment(Pos.CENTER);
			root.setSpacing(20);

			Button btn1 = new Button("버튼1");
			btn1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.out.println("버튼1 클릭");
				}
			});

			Button btn2 = new Button("버튼2");
			btn2.setOnAction(event -> System.out.println("버튼2 클릭"));

			root.getChildren().addAll(btn1, btn2);
			Scene scene = new Scene(root);

			primaryStage.setScene(scene);
			primaryStage.setOnCloseRequest(event -> System.out.println("종료 클릭"));

		} else if (showExam == 1) {

			HBox hbox = new HBox();
			hbox.setPadding(new Insets(10));
			hbox.setSpacing(10);

			TextField textField = new TextField();
			textField.setPrefWidth(200);

			Button button = new Button();
			button.setText("확인");

			ObservableList list = hbox.getChildren();
			list.add(textField);
			list.add(button);

			Scene scene = new Scene(hbox);

			primaryStage.setScene(scene);

		} else if (showExam == 2) {

			VBox root = new VBox();
			root.setPrefWidth(350);
			root.setPrefHeight(150);
			root.setAlignment(Pos.CENTER);
			root.setSpacing(20);

			Label label = new Label();
			label.setText("Hello, JavaFX");
			label.setFont(new Font(50));

			Button button = new Button();
			button.setText("확인");
			button.setOnAction(event -> Platform.exit());

			root.getChildren().add(label);
			root.getChildren().add(button);

			Scene scene = new Scene(root);

			primaryStage.setScene(scene);

		} ///////////////// [END] //////////////////

		primaryStage.show();
		System.out.println(Thread.currentThread().getName() + ": start() 호출");
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() 호출");
	}

}
