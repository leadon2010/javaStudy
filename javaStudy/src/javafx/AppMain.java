package javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.ui.AccordionUI;
import javafx.ui.ButtonUI;
import javafx.ui.SceneUI;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread() + ": AppMain call");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread() + ": start call");

		SceneUI scene = new ButtonUI();

		primaryStage.setTitle(scene.getTitle());
		primaryStage.setScene(scene.getScene());
		primaryStage.setOnCloseRequest(event -> System.out.println("closed."));
		primaryStage.setWidth(300);
		primaryStage.setHeight(190);
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
