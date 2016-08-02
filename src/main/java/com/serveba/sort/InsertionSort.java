package com.serveba.sort;

public class InsertionSort {
	
	
	/**
	 * time -> O(n^2)
	 * space -> O(n)
	 * 
	 * Good for incremental insertion:
	 * 
	 *  if the vector is sorted time complexity of 
	 *  inserting new element is O(n).
	 * 
	 * @param v
	 * @return
	 */
	public int [] sort(int [] v) {
		
		for (int i=0; i < v.length; i++) {
			for(int j=i+1; j < v.length && j > 0; j--) {
				if(v[j] < v[j-1]) {
					int aux = v[j-1];
					v[j-1] = v[j];
					v[j] = aux;
				}
			}
		}
		
		return v;
	}

}
