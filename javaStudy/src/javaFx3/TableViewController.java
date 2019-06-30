package javaFx3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TableViewController implements Initializable {
	@FXML
	private ListView<String> listView;
	@FXML
	private TableView<Phone> tableView;
	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		listView.setItems(FXCollections.observableArrayList(
				"갤럭시S1", "갤럭시S2", "갤럭시S3", "갤럭시S4", "갤럭시S5", "갤럭시S6", "갤럭시S7"
				));

		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}
		});

		ObservableList phoneList = FXCollections.observableArrayList(new Phone("갤럭시S1", "images/phone01.png"),
				new Phone("갤럭시S2", "images/phone02.png"), new Phone("갤럭시S3", "images/phone03.png"),
				new Phone("갤럭시S4", "images/phone04.png"), new Phone("갤럭시S5", "images/phone05.png"),
				new Phone("갤럭시S6", "images/phone06.png"), new Phone("갤럭시S7", "images/phone07.png"));

		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory<>("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");

		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory<>("image"));
		tcImage.setStyle("-fx-alignment: CENTER;");

		tableView.setItems(phoneList);

		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> arg0, Phone oldValue, Phone newValue) {
				if (newValue != null) {
					imageView.setImage(new Image(getClass().getResource("images/" + newValue.getImage()).toString()));
				}
			}
		});
	}

	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView  스마튼 폰: " + item);

		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView 스마튼폰: " + phone.getSmartPhone());
		System.out.println("TableView 이미지: " + phone.getImage());
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}