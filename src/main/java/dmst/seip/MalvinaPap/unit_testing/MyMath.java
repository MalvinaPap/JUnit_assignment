package dmst.seip.MalvinaPap.unit_testing;
/**
 * An class that provides some "simple" math operations
 * for demonstrating Unit Testing.
 * @author Malvina
 */
import java.lang.IllegalArgumentException;

/**
 * receives 2 integers and returns their division result
 * or throws exception if the denominator is zero
 * @param num the numerator
 * @param num the denominator
 * @throws IllegalArgumentException
 *
 */
public class MyMath {

	double divide(int num, int denom) {
		if (denom==0) {
			throw new IllegalArgumentException("'denominator' cannot be zero");
		}
		double result = num/denom;
		return result;
	}
	
}
