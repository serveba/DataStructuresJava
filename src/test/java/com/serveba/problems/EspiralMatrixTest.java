package com.serveba.problems;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EspiralMatrixTest {
	
	private EspiralMatrix problem;

	private final int[][] MATRIX_1 = { 
		{ 1, 2, 3, 4, 5 }, 
		{ 14, 15, 16, 17, 6 }, 
		{ 13, 20, 19, 18, 7 },
		{ 12, 11, 10, 9, 8 } 
	};
	private final String RESULT_1 = "1234567891011121314151617181920";
	
	private final int[][] MATRIX_2 = { {1, 2}, {4, 3} };
	private final String RESULT_2 = "1234";
	
	private final int[][] MATRIX_3 = { 
			{1, 2, 3, 4, 5, 6, 7}, 
			{14, 13, 12, 11, 10, 9, 8} };
	private final String RESULT_3 = "1234567891011121314";
	


	@Before
	public void setUp() {
		problem = new EspiralMatrix();
	}

	@After
	public void tearDown() {
		problem = null;
	}

	
	@Test
	public void testEspiralMatrix1() {
		assertEquals(RESULT_1, problem.solve(MATRIX_1));
	}
	
	@Test
	public void testEspiralMatrix2() {
		assertEquals(RESULT_2, problem.solve(MATRIX_2));
	}
	
	@Test
	public void testEspiralMatrix3() {
		assertEquals(RESULT_3, problem.solve(MATRIX_3));
	}
	
}
