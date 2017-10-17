package test;

public class Power {
	public long power(int a, int b) {
	    if (b == 0) {
	    	return 1;
	    }
    	long c = power(a, b / 2);
	    if (b % 2 == 0) {
	    	return c * c;
	    }
	    else {
	    	return c * c * a; 
	    }
	}
}
