package com.serveba.sort;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MergeSortTest {

	private static final int[] UNSORTED_ARRAY = new int[] { 4, 3, 1, 6, 2 };

	private static final int[] SORTED_ARRAY = new int[] { 1, 2, 3, 4, 6 };

	@Test
	public void testSort() {
		// unsorted -> sorted
		
		int[] v = MergeSort.sort(UNSORTED_ARRAY);
		
//		System.out.println(Arrays.toString(v));
		
		assertTrue(SORTED_ARRAY.length == v.length);
		for (int i = 0; i < v.length; i++) {
			assertTrue(v[i] == SORTED_ARRAY[i]);
		}
		
		// sorted -> sorted
		v = MergeSort.sort(SORTED_ARRAY);
		assertTrue(SORTED_ARRAY.length == v.length);
		for (int i = 0; i < v.length; i++) {
			assertTrue(v[i] == SORTED_ARRAY[i]);
		}
		
		// empty -> empty
		v = MergeSort.sort(new int [] {});
		assertTrue(v.length == 0);
	}

}
