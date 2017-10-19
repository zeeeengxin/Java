package datastructure;

public class FirstOccurrence {
	public int firstOccur(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] >= target) {// don't forget to put array[]!
				right = mid;
			}
			else {
				left = mid;
			}
		}
		if (array[left] == target) {// don't forget to put array[]!
			return left;
		}
		if (array[right] == target) {
			return right;
		}
		return -1;
	}
}
