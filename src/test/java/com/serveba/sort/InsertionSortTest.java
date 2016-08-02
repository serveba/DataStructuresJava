package com.serveba.sort;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

	private int[] UNSORTED_ARRAY = new int[] { 4, 3, 1, 6, 2 };

	private int[] SORTED_ARRAY = new int[] { 1, 2, 3, 4, 6 };

	private InsertionSort algorithm;

	@Before
	public void setUp() {
		algorithm = new InsertionSort();
	}

	@After
	public void tearDown() {
		algorithm = null;
	}

	@Test
	public void testSort() {
		// unsorted -> sorted
		int[] v = algorithm.sort(UNSORTED_ARRAY);
		assertTrue(SORTED_ARRAY.length == v.length);
		for (int i = 0; i < v.length; i++) {
			assertTrue(v[i] == SORTED_ARRAY[i]);
		}
		
		// sorted -> sorted
		v = algorithm.sort(SORTED_ARRAY);
		assertTrue(SORTED_ARRAY.length == v.length);
		for (int i = 0; i < v.length; i++) {
			assertTrue(v[i] == SORTED_ARRAY[i]);
		}
		
		// empty -> empty
		v = algorithm.sort(new int [] {});
		assertTrue(v.length == 0);
	}

}
