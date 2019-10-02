package org.cvtc.shapes;

public class ShapeFactory {
	
	private Dialog dialog;

	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
	public Shape make(ShapeType type) {
		switch(type) {
		
		case Cuboid:
			return new Cuboid(getDialog(), 1, 2, 3);
		case Cylinder:
			return new Cylinder(getDialog(), 5, 10);
		case Sphere:
			return new Sphere(getDialog(), 6);
		default:
			return null;
		}
			 
	}

}
