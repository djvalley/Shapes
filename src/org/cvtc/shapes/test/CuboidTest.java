package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.MessageBoxSub;
import org.junit.Test;

public class CuboidTest {
	
	Dialog messageBox = new MessageBoxSub();
	
	Cuboid cube1 = new Cuboid(messageBox, -1,0,10);
	Cuboid cube2 = new Cuboid(messageBox, 20,15,11);
	Cuboid cube3 = new Cuboid(messageBox, -10,50,2);
	
	 
	@Test
	public void testConstructor() {
		
		assertTrue(cube1 instanceof Cuboid);
	}
	
	@Test
	public void testGetWidth() {
		
		assertEquals(1.0, cube1.getWidth(), 0.0);
		
	}
	
	@Test
	public void testGetHeight() {
		
		assertEquals(1.0, cube1.getHeight(), 0.0);
		
	}
	
	@Test
	public void testGetDepth() {
		
		assertEquals(10.0, cube1.getDepth(), 0.0);
		
	}
	
	@Test
	public void testGetSurfaceArea1() {
		
		assertEquals(42.0, cube1.surfaceArea(), 0.0);
		
	}	
	
	@Test
	public void testGetSurfaceArea2() {
		
		assertEquals(1370.0, cube2.surfaceArea(), 0.0);
		
	}	
	
	@Test
	public void testGetSurfaceArea3() {
		
		assertEquals(304.0, cube3.surfaceArea(), 0.0);
		
	}
	 
	@Test
	public void testGetVolume1() {
		
		assertEquals(10.0, cube1.volume(), 0.0);
		
	}

	 
	@Test
	public void testGetVolume2() {
		
		assertEquals(3300.0, cube2.volume(), 0.0);
		
	}

	 
	@Test
	public void testGetVolume3() {
		
		assertEquals(100.0, cube3.volume(), 0.0);
		
	}
	
	@Test
	public void testRender() {
		
		cube1.render();
		
	}
	

}
