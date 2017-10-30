package datastructure;

import java.util.*;

//result not in ascending order
public class KthSmallest {
	// solution 1 with max heap
	public List<Integer> minK1(int[] array, int k) {
		Queue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			maxHeap.offer(array[i]);
		}
		 for (int i = k; i < array.length - 1; i++) {
			 if (array[i] < maxHeap.peek()) {
				 maxHeap.offer(array[i]);
				 maxHeap.poll();
			 }
		 }
		 List<Integer> res = new ArrayList<>();
		 while (!maxHeap.isEmpty()) {
			 res.add(maxHeap.poll());
		 }
		 return res;
	}
	// solution 2 with min heap
	public List<Integer> minK2(int[] array, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		Queue<Integer> minHeap = new PriorityQueue<>(list);
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			res.add(minHeap.poll());
		}
		return res;
	}
	// solution 3 with quick select
	public static List<Integer> minK3(int[] array, int k) {
		List<Integer> list = new ArrayList<>();
		helper(array, k - 1, 0, array.length - 1);
		for (int i = 0; i < k; i++) {
			list.add(array[i]);
		}
		return list;
	}
	private static void helper(int[] array, int k, int left, int right) {
		if (left >= right) return; // in case k is larger than array.length - 1 ***IMPOARTANT
		 int pivot = (int) (left + (right - left + 1) * Math.random());
		 /* Random random = new Random();
		  * int pivotIndex = left + random.nextInt(right - left + 1);
		  */
		 swap(array, pivot, right);
		 int i = left, j = right - 1;
		 while (i <= j) {
			 if (array[i] < array[right]) {
				 i++;
			 }
			 else if (array[j] >= array[right]) {
				 j--;
			 }
			 else {
				 swap(array, i, j);
			 }
		 }
		 swap(array, i, right);
		 if (i == k) {
			 return;
		 }
		 else if (i > k) {
			 helper(array, k, left, i - 1);
		 }
		 else {
			 helper(array, k, i + 1, right);
		 }
	}
	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	public static void main (String[] args) { // testing
		int[] arr = {1, 2, 7, 3, 9, 8, 5, 4};
		List<Integer> l;
		l = minK3(arr, 7);
		for (int i = 0; i < 7; i++) {
			System.out.println(l.get(i));
		}
	}
}
