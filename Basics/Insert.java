package test;

public class Insert {
	public static void main(String[] args) {
		int[] oldArr = {1, 3, 5, 7};
		int[] newArr = insert(oldArr, 4, 2);
		for (int i : newArr)	
			System.out.println(i); // print one by one
	}
	public static int[] insert(int[] oldArr, int item, int index) {
		if (oldArr == null)
			return oldArr;
		int[] newArr = new int[oldArr.length + 1];
		index = Math.min(oldArr.length, index); 
		// check if index is too big!!!
		for (int i = 0; i < newArr.length; i++) {
			if (i < index)
				newArr[i] = oldArr[i];
			else if (i == index)
				newArr[i] = item;
			else
				newArr[i] = oldArr[i - 1];
		}
		return newArr;
	}
}
