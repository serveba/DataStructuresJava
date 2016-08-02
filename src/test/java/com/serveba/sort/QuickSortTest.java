package com.serveba.sort;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {

	private static final int[] UNSORTED_ARRAY = new int[] { 4, 3, 1, 6, 2 };

	private static final int[] SORTED_ARRAY = new int[] { 1, 2, 3, 4, 6 };

	private QuickSort algorithm;

	@Before
	public void setUp() {
		algorithm = new QuickSort();
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
