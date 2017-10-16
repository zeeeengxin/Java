package test;

public class myQueue {
	int[] myqueue = new int[100];
	int end = 0;
	
	public void offer(int elem) {
		myqueue[end] = elem;
		end++;
	}
	
	public Integer poll() {
		if (end == 0)
			return null;
		int tmp = myqueue[0];
		for (int i = 0; i < end - 1; i++) {
			myqueue[i] = myqueue[i + 1];
		}
		end--;
		return tmp;
	}
	
	public Integer peek() {
		if (end > 0)
			return myqueue[0];
		else
			return null;
	}
	
	public int size() {
		return (end);
	}
	
	public boolean isEmpty() {
		if (end == 0)
			return true;
		else
			return false;
	}
}
