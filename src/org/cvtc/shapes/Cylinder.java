package org.cvtc.shapes;


public class Cylinder extends Shape implements Renderer{
	
	
	private float radius = 0.0f;
	private float height = 0.0f;
	

	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		this.radius = (radius > 0) ? radius : 1 ;
		this.height = (height > 0) ? height : 1 ;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = (radius > 0) ? radius : 1 ;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = (height > 0) ? height : 1 ;
	}

	@Override
	public float surfaceArea() {
		return (float) ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}

	@Override
	public float volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}

	@Override
	public void render() {
		
		String message = "Radius: " + radius + "\n" + 
						 "Height: " + height + "\n" +
						 "Surface Area: " + surfaceArea() + "\n" +
						 "Volume: " + volume() + "\n";
		String title = "Cylinder";
		getMessageBox().show(message, title);
		
	}

	
	
}
