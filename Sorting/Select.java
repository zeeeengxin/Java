package sorting;

public class Select {
	public int[] solve(int[] array) {
		if (array == null || array.length == 0)
			return array;
		int n = array.length; // don't need to calculate every time
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {// can start from i+1
				if (array[j] < array[min])
					min = j;
			}
			swap(array, min, i);
		}
		return array;
	}
	private void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
