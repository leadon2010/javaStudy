package samplefx;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScaleMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Rectangle rect = new Rectangle(100, 100, 100, 100);
		rect.setArcHeight(50);
		rect.setArcWidth(50);
		rect.setFill(Color.VIOLET);

		ScaleTransition st = new ScaleTransition(Duration.millis(2000), rect);
		st.setByX(1.5f);
		st.setByY(1.5f);
		st.setAutoReverse(true);
		st.play();

		root.getChildren().add(rect);

		Scene scene = new Scene(root, 500, 400);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
