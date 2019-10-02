package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dialog messageBox = new MessageBox();

		ShapeFactory shapeFactory = new ShapeFactory(messageBox);


		// Create an object for each shape
		Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.Cuboid);
		Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.Cylinder);
		Sphere sphere = (Sphere) shapeFactory.make(ShapeType.Sphere);

		// Output each shape's data
		cuboid.render();
		cylinder.render();
		sphere.render();

	}

}
