package sorting;

public class Merge {
	public int[] mergeSort(int[] array) {
		if (array == null || array.length == 0)
			return array;
		int[] helper = new int[array.length];
		//better to create helper here: just need to create one time and convenient
		sort(array, helper, 0, array.length - 1);
		return array;
	 }
	private void sort(int[] array, int[] helper, int left, int right) {
		if (left == right)
			return;
		int mid = (left + right) / 2;
		sort(array, helper, left, mid);
		sort(array, helper, mid + 1, right);
		merge(array, helper, left, right, mid);
	}
	private void merge(int[] array, int[] helper, int left, int right, int mid) {
		for (int i = left; i <= right; i++) {
			helper[i] = array[i];
		}
		int pLeft = left;
		int pRight = mid + 1;
		int index = left;
		while (pLeft <= mid && pRight <= right) {
			if (helper[pLeft] <= helper[pRight]) {// should add a '=' here!
				array[index] = helper[pLeft];
				pLeft++;
			}
			else if (helper[pLeft] > helper[pRight]) {
				array[index] = helper[pRight];
				pRight++;
			}
			index++;
		}
		while (pLeft <= mid) {
			array[index] = helper[pLeft];
			pLeft++;
			index++;
		}
	}
}
