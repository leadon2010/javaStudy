package javaFx3;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;

	public Phone(String smartPhone, String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}

	public SimpleStringProperty getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(SimpleStringProperty smartPhone) {
		this.smartPhone = smartPhone;
	}

	public SimpleStringProperty getImage() {
		return image;
	}

	public void setImage(SimpleStringProperty image) {
		this.image = image;
	}

}
