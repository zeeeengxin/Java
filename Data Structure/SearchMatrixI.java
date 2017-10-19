package datastructure;

public class SearchMatrixI {
	public int[] search(int[][] matrix, int target) {
		/* if (matrix.length == 0 || matrix[0].length == 0) {
			return new int[] {-1, -1};
		} */
		int[] index = {-1, -1};
		int row = matrix.length;
		int col = matrix[0].length;
		int left = 0;
		int right = row * col - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			/* int i = mid / col;// col: has nothing to do with row
			int j = mid % col;// col: both are column!
			if (matrix[i][j] == target) {
				return new int[] {i, j};
			}
			else if (matrix[i][j] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return new int[] {-1, -1};//pay attention to the format */
			if (target == matrix[mid/col][mid%col]) {
				index[0] = mid / col;
				index[1] = mid % col;
				return index;
			}
			else if (target < matrix[mid/col][mid%col]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return index;// if row = 0 or col = 0; just return -1 -1
	}
}
