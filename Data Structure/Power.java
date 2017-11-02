package test;

public class Power {
	public long power(int a, int b) {
	    if (b == 0) {
	    	return 1;
	    }
	    if (a == 0) {
	    	return 0; // without this, it will go down to 0^0
	    	// 0^0 is not defined
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
