package pfx.control;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;

	public Phone(String smartPhone, String image) {
		super();
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}

	public String getSmartPhone() {
		return smartPhone.getValue().toString();
	}

	public void setSmartPhone(SimpleStringProperty smartPhone) {
		this.smartPhone = smartPhone;
	}

	public String getImage() {
		return image.getValue().toString();
	}

	public void setImage(SimpleStringProperty image) {
		this.image = image;
	}

}
