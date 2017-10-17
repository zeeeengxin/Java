package sorting;

import java.util.Random;

public class QuickRandom {
	Random rand = new Random();
	// use a class called Random
	// first, need to create an instance
	
	public int[] quickSort(int[] array) {
		if (array == null || array.length == 0)
			return array;
		quickSort(array, 0, array.length - 1);
		return array;
	}
	
	public void quickSort(int[] array, int left, int right) {
		if (left >= right)
			return;
		int pivotPos = partition (array, left, right);
		quickSort(array, left, pivotPos - 1);
		quickSort(array, pivotPos + 1, right);
	}
	
	private int partition(int[] array, int left, int right) {
		int pivotIndex = left + rand.nextInt(right - left + 1);
		// nextInt(n) get a random number among [0, n)
		int pivot = array[pivotIndex];// store the value of pivot
		swap(array, pivotIndex, right); //shift pivot to the end
		int leftBound = left;
		int rightBound = right - 1;
		while (leftBound <= rightBound) {
			if (array[leftBound] < pivot)
				leftBound++;
			else if (array[rightBound] >= pivot)
				rightBound--;
			else
				swap(array, leftBound, rightBound);
		}
		swap(array, leftBound, right);
		return leftBound;
	}
	
	private void swap(int[] array, int a, int b) {
		int tmp;
		tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

}
