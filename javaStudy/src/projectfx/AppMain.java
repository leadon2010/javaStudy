package projectfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread() + ": AppMain call");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread() + ": start call");
		String ui = "Binding";
		String control = "./control/" + ui + ".fxml";

		Parent root = FXMLLoader.load(getClass().getResource(control));
		Scene scene = new Scene(root);

		primaryStage.setTitle(ui);
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(event -> System.out.println("closed."));
//		primaryStage.setWidth(300);
//		primaryStage.setHeight(190);
		primaryStage.show();
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread() + ": init call");

//		Parameters params = getParameters();
//		Map<String, String> map = params.getNamed();
//		Set<String> set = map.keySet();
//		for (String s : set) {
//			System.out.println("k: " + s + " v: " + map.get(s));
//		}
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().toString() + ": stop call");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
