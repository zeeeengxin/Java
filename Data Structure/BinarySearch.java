package datastructure;

public class BinarySearch {
	public int binarySearch(int[] array, int target) {
		if (array == null || array.length == 0)
			return -1; // don't forget about corner case!
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
