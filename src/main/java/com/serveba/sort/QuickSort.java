package com.serveba.sort;


public class QuickSort {
	
	private int [] v;


	/**
	 * avg time -> O(n*lgn) worst time -> O(n^2) space -> O(n) --> in place
	 * 
	 * usually if the pivot value is a good value (e.g. mean of three) we are
	 * close to the avg time.
	 * 
	 * This is the widely considered best general sorting algorithm
	 * 
	 * 
	 * 
	 * @param v
	 * @return
	 */
	public int [] sort(int [] arr) {
		v = arr;
		quickSort(v, 0, v.length-1);
		return v;
	}

	/**
	 * we pick the pivot in a clever way
	 * 
	 * "mean of three"
	 * 
	 * with this we statistically ensure QuickSort average time O(nlgn)
	 * 
	 * @param v
	 * @return
	 */
	private int getPivot(int [] arr, int i, int j) {
//		Random rand = new Random();
//
//		return (arr[rand.nextInt(i + j) + i] + 
//				arr[rand.nextInt(i + j) + i] + 
//				arr[rand.nextInt(i + j) + i]) / 3;
		
		
		int middle = i + (j - i) / 2;
		return arr[middle];

	}

	public void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		// pick the pivot
		int pivot = getPivot(arr, low, high);

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j) {
			quickSort(arr, low, j);
		}

		if (high > i) {
			quickSort(arr, i, high);
		}
	}

}
