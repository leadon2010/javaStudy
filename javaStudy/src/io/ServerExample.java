package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();

	/////////////////////////////////////////////////
	////////// startServer() ///////////////////////
	/////////////////////////////////////////////////
	void startServer() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater(() -> {
					displayText("[서버 시작]");
					btnStartStop.setText("stop");
				});
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + " : "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(() -> displayText("[연결 개수: " + connections.size() + "]"));
					} catch (Exception e) {
						if (!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			};
		};
		executorService.submit(runnable);
	}

	/////////////////////////////////////////////////
	////////// stopServer() /////////////////////////
	/////////////////////////////////////////////////
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/////////////////////////////////////////////////
	////////// Client /////////////////////////
	/////////////////////////////////////////////////
	class Client {
		Socket socket;

		Client(Socket socket) {
			this.socket = socket;
		}

		///////////// receive() ///////////////
		void receive() {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					while (true) {
						byte[] buf = new byte[100];
						try {
							InputStream is = socket.getInputStream();
							int readByte = is.read(buf);
							if (readByte == -1) {
								throw new IOException();
							}
							String message = "[요청처리: " + socket.getRemoteSocketAddress() + " : "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							String data = new String(buf, 0, readByte, "UTF-8");
							for (Client client : connections) {
								client.send(data);
							}
						} catch (Exception e) {
							try {
								connections.remove(Client.this);
								String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + " : "
										+ Thread.currentThread().getName() + "]";
								Platform.runLater(() -> displayText(message));
								socket.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}
				}
			};
			executorService.submit(runnable);
		}

		///////////// send() ///////////////
		void send(String data) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						byte[] buf = data.getBytes("UTF-8");
						OutputStream os = socket.getOutputStream();
						os.write(buf);
						os.flush();
					} catch (Exception e) {
						String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + " : "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));
						connections.remove(Client.this);
						try {
							socket.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			};
			executorService.submit(runnable);
		}
	} // end of Client class

	TextArea txtDisplay;
	Button btnStartStop;

	/////////////////////////////////////////////////
	////////// @start() /////////////////////////
	/////////////////////////////////////////////////
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
			} else {
				stopServer();
			}
		});

		root.setBottom(btnStartStop);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());

		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event -> stopServer());
		primaryStage.show();

	}

	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
