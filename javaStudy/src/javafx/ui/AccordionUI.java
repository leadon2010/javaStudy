package javafx.ui;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class AccordionUI implements SceneUI {

	@Override
	public String getTitle() {
		return "Accordian";
	}

	@Override
	public Scene getScene() {

		Scene scene = new Scene(new Group());

		VBox vbox = new VBox();
		vbox.setLayoutX(20);
		vbox.setLayoutY(20);

		final String content = "Lorem ipsum";
		final Text text = new Text(10, 20, "");

		final Animation animation = new Transition() {
			{
				setCycleDuration(Duration.millis(2000));
			}

			protected void interpolate(double frac) {
				final int length = content.length();
				final int n = Math.round(length * (float) frac);
				text.setText(content.substring(0, n));
			}

		};
		animation.play();

		vbox.getChildren().add(text);
		vbox.setSpacing(10);
		((Group) scene.getRoot()).getChildren().add(vbox);

		return scene;
	}

}
