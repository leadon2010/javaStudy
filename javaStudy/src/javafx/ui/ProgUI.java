package javafx.ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ProgUI implements SceneUI {
	@Override
	public String getTitle() {
		return "ProgUI";
	}

	@Override
	public Scene getScene() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);

		TextField textField = new TextField();
		textField.setPrefWidth(200);

		Button button = new Button();
		button.setText("확인");

//		ObservableList list = hbox.getChildren();
//		list.add(textField);
//		list.add(button);
		hbox.getChildren().add(textField);
		hbox.getChildren().add(button);

		Scene scene = new Scene(hbox);

		return scene;
	}

}
