package test;

public class Diag {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		if (matrix.length != matrix[0].length)
			System.out.println("Can't calculate trace for non-sqr.");
		// don't forget corner case!!!
		int trace = 0;
		/* for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == j)
					trace += matrix[i][j];
			}
		} don't need to be like this*/
		for (int i = 0; i < matrix.length; i++)
			trace += matrix[i][i];
		System.out.println(trace);
	}
}
