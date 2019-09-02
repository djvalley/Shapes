package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuboid cube = new Cuboid(1,2,3);
		
		cube.render();
		
		Cylinder cylinder = new Cylinder(5,10);
		
		cylinder.render();
		
		Sphere sphere = new Sphere(6);
		
		sphere.render();
		
	}

}
