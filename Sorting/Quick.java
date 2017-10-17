package sorting;

// use the last number as pivot
public class Quick {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 3, 3, -1};
		int[] arr2 = new int[6];
		arr2 = quickSort(arr);
		for (int i : arr2)
			System.out.println(i);
	}
	public static int[] quickSort(int[] array) {
		if (array == null || array.length == 0)
			return array;
		quickSort(array, 0, array.length - 1);
		return array;
	 }
	private static void quickSort(int[] array, int left, int right) {
		if (left >= right)
			return;
		int i = left;// left! not zero!
		int j = right - 1;
		while (i <= j) {
			if (array[i] >= array[right] && array[j] < array[right]) {
				swap(array, i, j);
				i++;
				j--;// j is decreased!
			}
			else if (array[i] < array[right])
				i++;
			else if (array[j] >= array[right])
				j--;
		}
		swap(array, i, right);
		quickSort(array, left, i - 1);
		quickSort(array, i + 1, right);
		
	}
	private static void swap(int[] array, int a, int b) {
		int tmp;
		tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
