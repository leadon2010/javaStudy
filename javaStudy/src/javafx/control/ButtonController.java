package javafx.control;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonController implements Initializable {
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;
	@FXML private Button btnExit;
	@FXML private RadioButton rad1, rad2, rad3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				try {
//					Image image = new Image(getClass().getResource("images/" + newValue.getUserData().toString() + ".png").toString());
					Image image = new Image(Paths.get("images/" + newValue.getUserData().toString() + ".png").toUri().toString());
					radioImageView.setImage(image);
				} catch (Exception e1) {
					System.out.println(getClass().getResource("images/" + newValue.getUserData().toString() + ".png").toString());
				}
			}
		});
	}

	public void handleChkAction(ActionEvent e) {

		try {
			if (chk1.isSelected() && chk2.isSelected()) {
//				checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
				checkImageView.setImage(new Image(Paths.get("images/geek-glasses-hair.gif").toUri().toString()));
			} else if (chk1.isSelected()) {
//				checkImageView.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
				checkImageView.setImage(new Image(Paths.get("images/geek-glasses.gif").toUri().toString()));
			} else if (chk2.isSelected()) {
//				checkImageView.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
				checkImageView.setImage(new Image(Paths.get("images/geek-hair.gif").toUri().toString()));
			} else {
//				checkImageView.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
				checkImageView.setImage(new Image(Paths.get("images/geek.gif").toUri().toString()));
			}
		} catch (Exception ee) {
			System.out.println("지정된 경로에서 파일을 찾을 수 없습니다.");
		}
	}

	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}

}
