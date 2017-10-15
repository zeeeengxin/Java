package test;

public class Findmax {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int max = maxValue(arr);
		System.out.println(max);
	}
	
	public static int maxValue(int[] a) {
		int max;
		if (a == null || a.length == 0)
			return 0;
		max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}
}
