package javafx;

import java.util.Map;
import java.util.Set;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.ui.AppServiceUI;
import javafx.ui.AppUI;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread() + ": AppMain call");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread() + ": start call");

		AppServiceUI root = new AppUI();

		Scene scene = new Scene(root.showUI());

		primaryStage.setTitle("App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread() + ": init call");

		Parameters params = getParameters();
		Map<String, String> map = params.getNamed();
		Set<String> set = map.keySet();
		for (String s : set) {
//			System.out.println("k: " + s + " v: " + map.get(s));
		}
	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().toString() + ": stop call");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
