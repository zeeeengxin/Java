package test;

public class myStack {
	int[] mystack = new int[100];
	int top = 0;
	
	public void push(int elem) {
		mystack[top] = elem;
		top++;
	}
	
	public Integer pop() {
		if (top == 0)
			return null;
		top--;
		return mystack[top];
	}
	
	public Integer peek() {
		if (top > 0)
			return mystack[top - 1];
		else
			return null;
	}
	
	public int size() {
		return (top);
	}
	
	public boolean isEmpty() {
		if (top == 0)
			return true;
		else
			return false;
	}
}
