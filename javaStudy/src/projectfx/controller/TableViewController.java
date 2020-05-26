package projectfx.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import projectfx.model.EmpDAO;
import projectfx.model.Employee;

public class TableViewController implements Initializable {
	@FXML
	private TableView<Employee> tableView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		ObservableList<Employee> empList = FXCollections.observableArrayList(list);

		TableColumn<Employee, ?> tcFirstName = tableView.getColumns().get(0);
		tcFirstName.setCellValueFactory(new PropertyValueFactory("firstName"));
		tcFirstName.setStyle("-fx-alignment: CENTER;");

		TableColumn<Employee, ?> tcLastName = tableView.getColumns().get(1);
		tcLastName.setCellValueFactory(new PropertyValueFactory("lastName"));
		tcLastName.setStyle("-fx-alignment: CENTER;");

		TableColumn<Employee, ?> tcSalary = tableView.getColumns().get(2);
		tcSalary.setCellValueFactory(new PropertyValueFactory("salary"));
		tcSalary.setStyle("-fx-alignment: CENTER; ");

		tableView.setItems(empList);
	}

	public void handleBtnOkAction(ActionEvent event) {
		System.out.println("OK");
	}

	public void handleBtnCancelAction(ActionEvent event) {
		System.out.println("Cancel");
	}

}
