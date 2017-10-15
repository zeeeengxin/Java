package test;

public class Reverse {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		reverse(arr);
		for (int i : arr)
			System.out.println(i);
	}
	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
		}
	}
}
