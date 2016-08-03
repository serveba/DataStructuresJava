package com.serveba.problems.recursive;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InterleavingStringsTest {
	
	  private InterleavingStrings problem;

	  @Before
	  public void setUp() {
		  problem = new InterleavingStrings();
	  }

	  @After
	  public void tearDown() {
	    problem = null;
	  }

	@Test
	public void testInterleavingString1() {
		String s1 = "abc";
		String s2 = "de";
		
		problem.solve(s1, s2);
		List<String> solutions = problem.getSolutions();
		
		assertTrue(solutions.size() == 10);
		
//		for (String solution : solutions) {
//			System.out.println(solution);
//		}
		
	}

}
