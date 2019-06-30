package javaFx;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;

	public Phone(String smartPhone, String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}

	public SimpleStringProperty getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(SimpleStringProperty smartPhone) {
		this.smartPhone = smartPhone;
	}

	public SimpleStringProperty getImage() {
		return image;
	}

	public void setImage(SimpleStringProperty image) {
		this.image = image;
	}

}

public class TableViewMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml/TableView.fxml"));
		Scene scene = new Scene(root);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
