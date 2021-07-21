package com.example.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.tombola.MatrixDemo;

class MatrixDemoTest {

	@Test
	void fromIndexToXYV1() {
		MatrixDemo md = new MatrixDemo();
		int [] rowCol = md.getRowColumnFromIndexColumnMajorV1(7, 4, 5);
		assertEquals(1, rowCol[0]);	
		assertEquals(2, rowCol[1]);	
		assertEquals(md.getValue(rowCol[0], rowCol[1]), 8);	
	}
	
	@Test
	void fromIndexToXYV2() {
		MatrixDemo md = new MatrixDemo();
		int [] rowCol = md.getRowColumnFromIndexColumnMajorV1(7, 4, 5);
		assertEquals(1, rowCol[0]);	
		assertEquals(2, rowCol[1]);	
		assertEquals(md.getValue(rowCol[0], rowCol[1]), 8);	
	}
	
	@Test
	void fromXYToIndex() {
		
		MatrixDemo md = new MatrixDemo();
		int index = md.getLinearIndexFromRowMajor(1, 2, 5);
		
		//Risultato atteso: 7
		assertEquals(7, index);
		
	}

}
