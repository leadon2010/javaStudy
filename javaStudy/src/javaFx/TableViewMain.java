package javaFx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
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

class TableViewController implements Initializable {
	@FXML
	private ListView<String> listView;
	@FXML
	private TableView<Phone> tableView;
	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.setItems(
				FXCollections.observableArrayList("갤럭시S1", "갤럭시S2", "갤럭시S3", "갤럭시S4", "갤럭시S5", "갤럭시S6", "갤럭시S7"));
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}
		});

		ObservableList phoneList = FXCollections.observableArrayList(new Phone("갤럭시S1", "phone01.png"),
				new Phone("갤럭시S2", "phone02.png"), new Phone("갤럭시S3", "phone03.png"), new Phone("갤럭시S4", "phone04.png"),
				new Phone("갤럭시S5", "phone05.png"), new Phone("갤럭시S6", "phone06.png"),
				new Phone("갤럭시S7", "phone07.png"));
	}

}

public class TableViewMain extends Application {

	@Override
	public void start(Stage arg0) throws Exception {

	}

	public static void main(String[] args) {
		launch(args);
	}

}
