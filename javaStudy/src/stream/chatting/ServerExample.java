package stream.chatting;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.security.ntlm.Client;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<>();

	void startServer() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));

			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					Platform.runLater(() -> {
						displayText("[서버시작]");
						btnStartStop.setText("stop");
					});
					while (true) {
						Socket socket;
						try {
							socket = serverSocket.accept();
							String message = "[연결수락: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

			};
			executorService.submit(runnable);

		} catch (IOException e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			}
		}
	}

	void stopServer() {
		Iterator<Client>

	}

	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);

		btnStartStop.setOnAction(e -> {
			if (btnStartStop.getText().equals("start")) {
				startServer();
			} else if (btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});
		root.setBottom(btnStartStop);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event -> stopServer());
		primaryStage.show();

	} // end of start()

	public static void main(String[] args) {
		launch(args);
	}
}
