package pfx.control;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RunLaterController implements Initializable {
	@FXML
	private Label lblTime;
	@FXML
	private Button btnStart, btnStop;
	private boolean stop;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction((e) -> {
			handleBtnStart(e);
		});

		btnStop.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handleBtnStop(event);
			}

		});
	}

	public void handleBtnStart(ActionEvent e) {
		stop = false;
		Thread thread = new Thread() {

			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while (!stop) {
					String strTime = sdf.format(new Date());
					Platform.runLater(() -> {
						lblTime.setText(strTime);
					});
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		};
		thread.setDaemon(true);
		thread.start();
	}

	public void handleBtnStop(ActionEvent e) {
		stop = true;
	}

}
