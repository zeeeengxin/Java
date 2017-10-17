package datastructure;

import java.util.*;

public class Qbytwostacks {
	Deque<Integer> in;
	Deque<Integer> out;
	
	public Qbytwostacks() {
		in = new LinkedList<>();
		out = new LinkedList<>();
		// should not add "Deque<Integer>"; if add, create a new stack
	}
	
	private void inToOut() {
		if (out.isEmpty()) {// move only when out is empty
			while (!in.isEmpty()) {
				out.push(in.pop());
			}
		}
	}
	public Integer poll() {
		inToOut(); // move first
		if (out.isEmpty()) {
			return null;
		}
		else
			return out.pop();
		/* if (out.isEmpty() == false) {
		 	return out.pop();
		   }
		   else if (in.isEmpty() == false) {
		while (in.isEmpty() == false) {
				out.push(in.pop());
			}
			return out.pop();
		}
		else
			return null; */
	}
		  
	public void offer(int element) {
		in.push(element);
	}
		  
	public Integer peek() {
		inToOut();
		if (out.isEmpty()) {
			return null;
		}
		else
			return out.peek(); // just peek! not pop
		/*if (out.isEmpty() == false) {
			return out.peek();
		}
		else if (in.isEmpty() == false) {
			while (in.isEmpty() == false) {
				out.push(in.pop());
			}
			return out.peek();
		}
		return null;*/
	}
		  
	public int size() {
		return in.size() + out.size();
	}
		  
	public boolean isEmpty() {
		/* if (in.isEmpty() == true && out.isEmpty() == true)
		 *	 return true;
		 * else
		 *   return false; */
		return in.isEmpty() && out.isEmpty();
		// just need one line~
		// when call a method, should add "()" at the end!
	}
}
