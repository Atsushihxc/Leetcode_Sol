/**
 * look at how to import Math & use the functions in Math
 * look at how to convert double to an integer???
 * int num = db.intValue() takes the floor function
 * 
 * 
 * how to convert the an integer to a double??
 * int i
 * double d = i;
 * Double d = new Double(i);
 * Double d2 = Double.valueOf(i);
 * 
 * character to int??
 * (int)s.charAt(i) returns the ASCII value of the character/
 */


import java.lang.Math;
class Solution {
    public int mySqrt(int x) {
    	Double y = Math.sqrt(x);
    	int p = y.intValue();
		return p;
        
    }
}