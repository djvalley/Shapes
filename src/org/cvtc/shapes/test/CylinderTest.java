package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest {

	Cylinder cylinder1 = new Cylinder(-1, 0);
	Cylinder cylinder2 = new Cylinder(-100, 50);
	Cylinder cylinder3 = new Cylinder(13, 6.5f);
	

	@Test
	public void testConstructer() {

		assertTrue(cylinder1 instanceof Cylinder);
	
	}

	@Test
	public void testGetHeight() {

		assertEquals(1, cylinder1.getHeight(), 0.0);
	
	}

	@Test
	public void testGetRadius() {

		assertEquals(1, cylinder1.getRadius(), 0.0);
	
	}

	@Test
	public void testGetSurfaceArea1() {

		assertEquals(12.566370964050293, cylinder1.surfaceArea(), 0.0);
	
	}


	@Test
	public void testGetSurfaceArea2() {

		assertEquals(320.44244384765625, cylinder2.surfaceArea(), 0.0);
	
	}


	@Test
	public void testGetSurfaceArea3() {

		assertEquals(1592.7874755859375, cylinder3.surfaceArea(), 0.0);
	
	}

	@Test
	public void testGetVolume1() {

		assertEquals(3.1415927410125732, cylinder1.volume(), 0.0);
	
	}

	@Test
	public void testGetVolume2() {

		assertEquals(157.0796356201172, cylinder2.volume(), 0.0);
	
	}

	@Test
	public void testGetVolume3() {

		assertEquals(3451.03955078125, cylinder3.volume(), 0.0);
	
	}
}