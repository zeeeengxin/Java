package sorting;

import java.util.PriorityQueue;

public class KSort {
	// k sort + selection sort
	public void kSort(int[] array, int k) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j <= Math.min(i + k, array.length - 1); j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, min, i);
		}
	}
	private void swap(int[] array, int min, int i) {
		int t = array[min];
		array[min] = array[i];
		array[i] = t;
	}
	
	// k sort + heap
	public void kSortHeap(int[] array, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (int i = 0; i <= Math.min(array.length - 1, k); i++) { // "<="
			heap.offer(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			while (!heap.isEmpty()) {
				array[i] = heap.poll();
				if (i + k + 1 < array.length) {
					heap.offer(array[i + k + 1]); // don't forget to add 1
				}
			}
		}
	}
	// heap: use one for loop: if heap.size() > k, poll()
}
