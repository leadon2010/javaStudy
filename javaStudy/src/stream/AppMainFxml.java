package stream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMainFxml extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
//		HBox hbox = new HBox();
//		hbox.setPadding(new Insets(10));
//		hbox.setSpacing(10);
//		
//		TextField textField = new TextField();
//		textField.setPrefWidth(200);
//		
//		Button button = new Button();
//		button.setText("확인");
//		
//		hbox.getChildren().add(textField);
//		hbox.getChildren().add(button);
		
		Parent hbox = (Parent) FXMLLoader.load(getClass().getResource("Root.fxml"));
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("FXML");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
