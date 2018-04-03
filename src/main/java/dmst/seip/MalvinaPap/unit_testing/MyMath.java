package dmst.seip.MalvinaPap.unit_testing;
/**
 * An class that provides some simple math operations
 * @author Malvina
 */
import java.lang.IllegalArgumentException;


public class MyMath {
    
	/**
	 * receives 2 integers and returns their division result
	 * or throws exception if the denominator is zero
	 * @param num the numerator
	 * @param num the denominator
	 * @throws IllegalArgumentException
	 *
	 */
	double divide(int num, int denom) {
		if (denom==0) {
			throw new IllegalArgumentException("'denominator' cannot be zero");
		}
		double result = num/denom;
		return result;
	}
	

	/**
	 * Reverses the sign of a given number
	 * @param number the input number 
	 * @return a number with reversed sign
	 */
	public int reverseNumber(int number) {
		return -number;
	}
	
}
