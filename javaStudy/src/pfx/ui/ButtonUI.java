package pfx.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonUI implements SceneUI {

	@Override
	public String getTitle() {
		return "ButtonUI";
	}

	@Override
	public Scene getScene() {
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);

		Button btn1 = new Button("Btn1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("clicked.1");
			}
		});

		Button btn2 = new Button("Btn2");
		btn2.setOnAction(event -> {
			System.out.println("clicked.2");
		});

		root.getChildren().addAll(btn1, btn2);

		Scene scene = new Scene(root);

		return scene;
	}

}
