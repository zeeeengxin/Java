package sorting;

public class Rainbow {
	public int[] rainbowSort(int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		int i = 0;
		int j = 0;
		int k = array.length - 1;
		while (k >= j) {
			if (array[j] == -1) {
				swap(array, i, j);
				i++;
				j++;
			}
			else if (array[i] == 0) {
				j++;
			}
			else {
				swap(array, j, k);
				k--;// k decreases!
			}
		}
		return array;
	}
	private void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
