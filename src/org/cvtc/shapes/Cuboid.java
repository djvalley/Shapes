package org.cvtc.shapes;
import javax.swing.JOptionPane;


public class Cuboid extends Shape{
	
	
	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	

	public Cuboid(float width, float height, float depth) {
		super();
		this.width = (width > 0) ? width : 1 ;
		this.height = (height > 0) ? height : 1 ;
		this.depth = (depth > 0) ? depth : 1 ;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = (width > 0) ? width : 1 ;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = (height > 0) ? height : 1 ;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = (depth > 0) ? depth : 1 ;
	}

	@Override
	public float surfaceArea() {
		return (2 * ((width * height) + (height * depth) + (depth * width)));
	}

	@Override
	public float volume() {
		return (width * height * depth);
	}

	@Override
	public void render() {
		
		String message = "Width: " + width + "\n" + 
						 "Height: " + height + "\n" +
						 "Depth: " + depth + "\n" +
						 "Surface Area: " + surfaceArea() + "\n" +
						 "Volume: " + volume() + "\n";

		JOptionPane.showMessageDialog(null, message);
		
	}

	
	
}
