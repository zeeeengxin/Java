package sorting;

public class Counting {
	public void countingSort(int[] array, int lower, int upper) {
		int[] count = new int[upper - lower + 1];
		for (int i : array) {
			count[i - lower]++;
		}
		int index = 0;
		for (int i : count) {
			while (count[i] > 0) {
				array[index] = i + lower;
				count[i]--;
				index++;
			}// sometimes it's better to use while loop
		}
	}
	/* time: O(n + range). if range <= n, O(n)
	 * space: O(range). if O(range) == O(1), O(1)
	 */
}
