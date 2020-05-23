package pfx.control;

import java.net.URL;
import java.nio.file.Paths;
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

public class ViewController implements Initializable {

	@FXML
	private ListView<String> listView;
	@FXML
	private TableView<Phone> tableView;
	@FXML
	private ImageView imageView;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		listView.setItems(FXCollections.observableArrayList("Galaxy S1", "Galaxy S2", "Galaxy S3", "Galaxy S4",
				"Galaxy S5", "Galaxy S6", "Galaxy S7"));

		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println(oldValue + "/" + newValue);
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}

		});

		ObservableList phoneLinst = FXCollections.observableArrayList(new Phone("Galaxy S1", "phone01.png"),
				new Phone("Galaxy S2", "phone02.png"), new Phone("Galaxy S3", "phone03.png"),
				new Phone("Galaxy S4", "phone04.png"), new Phone("Galaxy S5", "phone05.png"),
				new Phone("Galaxy S6", "phone06.png"), new Phone("Galaxy S7", "phone07.png"));

		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER;");

		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER;");

		tableView.setItems(phoneLinst);

		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				if (newValue != null) {
					imageView.setImage(new Image(Paths.get("images/" + newValue.getImage()).toUri().toString()));
				}
//				listView.getSelectionModel().select(newValue.getSmartPhone());
//				listView.scrollTo();
			}

		});
	}

	public void handleBtnOkAction(ActionEvent e) {
		String item = listView.getSelectionModel().getSelectedItem();
		System.out.println("ListView : " + item);

		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("TableView: " + phone.getSmartPhone());
		System.out.println("TableView: " + phone.getImage());
	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}

}
