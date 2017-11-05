package sorting;

import java.util.*;

public class Bucket {
	// range [0, 1)
	public void bucketSort(double[] array) {
		int n = array.length;
		List<List<Double>> helper = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			helper.add(new ArrayList<Double>()); // pay attention to the syntax
		}
		for (double j : array) {
			int index = (int) j * n;
			helper.get(index).add(j); // get the list first, and add it
		}
		for (List<Double> l : helper) {
			Collections.sort(l);
		}
		int index = 0;
		for (List<Double> l : helper) {
			for (double d : l) {
				array[index] = d;
				index++;
			}
		}
	}
	// range [a, b)
	public void bucketAll(double[] array, double a, double b) {
		int n = array.length;
		List<List<Double>> helper = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			helper.add(new ArrayList<Double>());
		}
		for (double d : array) {
			int index = (int) ((d - a)/(b - a) * n); // (d - a)/bucket width
			// bucket width = (b - a)/n
			helper.get(index).add(d);
		}
		int index = 0;
		for (List<Double> l : helper) {
			for (double d : l) {
				array[index] = d;
				index++;
			}
		}
	}
}
