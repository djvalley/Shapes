package org.cvtc.shapes;


public class Sphere extends Shape implements Renderer{
	
	
	private float radius = 0.0f;
	

	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		this.radius = (radius > 0) ? radius : 1 ;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = (radius > 0) ? radius : 1 ;
	}

	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float volume() {
		return (float) ((4 * 22 * radius * radius * radius)/(3*7));
	}

	@Override
	public void render() {
		
		String message = "Radius: " + radius + "\n" + 
						 "Surface Area: " + surfaceArea() + "\n" +
						 "Volume: " + volume() + "\n";
		
		String title = "Sphere";
		getMessageBox().show(message, title);
		
	}

	
	
}
