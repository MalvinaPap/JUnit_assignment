package dmst.seip.MalvinaPap.unit_testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Malvina
 * A method that provides a parameterized
 * test for the reverseNumber method of
 * MyMath class.
 *
 */
@RunWith(Parameterized.class)
public class MyMathTest_ReverseNumber_Parameterized {
	
	 
	 @Parameter 
	 public int result;
	 @Parameter 
	 public int input;
	 
	 MyMath mm = new MyMath();
	 
	 
	 @Parameters
	 public static Collection<Object[]> data() { 
		 Object[][] data = new Object[][] 
		 { {1,-1},{-2,2},{0,0},{Integer.MAX_VALUE,-Integer.MAX_VALUE}};
  
	     return Arrays.asList(data);    
	    	 
	 }
	  
	 @Test
	 public void test_ReverseNumber() {
		 Assert.assertEquals(result, mm.reverseNumber(input));
	 }
}

