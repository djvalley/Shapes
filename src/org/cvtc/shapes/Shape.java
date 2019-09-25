package org.cvtc.shapes;

public abstract class Shape {
	
	private Dialog messageBox;

	protected Dialog getMessageBox() {
		return messageBox;
	}
	
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	public Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	
	abstract public float surfaceArea();
	abstract public float volume();
	
	
}
