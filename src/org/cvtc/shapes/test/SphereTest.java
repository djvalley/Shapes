package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBoxSub;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	Dialog messageBox = new MessageBoxSub();
	
	Sphere sphere1 = new Sphere(messageBox, -1);
	Sphere sphere2 = new Sphere(messageBox, 56);
	Sphere sphere3 = new Sphere(messageBox, 22);
	
	@Test
	public void testConstructer() {

		assertTrue(sphere1 instanceof Sphere);
	
	} 

	@Test
	public void testGetRadius() {

		assertEquals(1, sphere1.getRadius(), 0.0);
	
	}

	@Test
	public void testGetSurfaceArea1() {

		assertEquals(12.566370964050293, sphere1.surfaceArea(), 0.0);
	
	}

	@Test
	public void testGetSurfaceArea2() {

		assertEquals(39408.13671875, sphere2.surfaceArea(), 0.0);
	
	}

	@Test
	public void testGetSurfaceArea3() {

		assertEquals(6082.12353515625, sphere3.surfaceArea(), 0.0);
	
	}

	@Test
	public void testGetVolume1() {

		assertEquals(1, sphere1.getRadius(), 0.0);
	
	}


	@Test
	public void testGetVolume2() {

		assertEquals(56, sphere2.getRadius(), 0.0);
	
	}

 
	@Test
	public void testGetVolume3() {

		assertEquals(22, sphere3.getRadius(), 0.0);
	
	}

	
	@Test
	public void testRender() {
		
		sphere1.render();
		
	}
	
}
