package classes.nestedInterfaces.a;

public class Button {
	public OnClickListener listener;

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	public void touch() {
		listener.onClick();
	}

	public interface OnClickListener {
		void onClick();
	}
}
