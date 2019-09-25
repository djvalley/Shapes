package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dialog messageBox = new MessageBox();
//		Renderer render = new Sphere(messageBox, 6);
//		render.render();

		Cuboid cube = new Cuboid(messageBox, 1, 2, 3);
		
		cube.render();
		
		Cylinder cylinder = new Cylinder(messageBox, 5, 10);
		
		cylinder.render();
		
		Sphere sphere = new Sphere(messageBox, 6);
		
		sphere.render();
		
	}

}
