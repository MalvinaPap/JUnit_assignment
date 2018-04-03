package dmst.seip.MalvinaPap.unit_testing;

import org.junit.Test;
import org.junit.Assert;

/**
 * An class that provides test cases for the 
 * math operations of the MyMath class
 * @author Malvina
 */
public class MyMathTest {
	
	MyMath mm = new MyMath(); /*create MyMath Object for the tests*/
	
	/*
	 * unit test that checks a zero denominator
	 */
	@Test (expected = IllegalArgumentException.class)
    public void testDivideShouldCauseException () {
    	mm.divide(10,0);
    } 
	 
	/*
	 * unit test that checks a simple division
	 */
	 @Test
	 public void testDivideShouldDoSimplePositiveDivision() {
	   Assert.assertEquals(5.0, mm.divide(10,2),0.5);
	  }
	 
     /*
	 * unit test that checks a complex division
	 */
      @Test
	  public void testDivideShouldDoComplexDivision() {
		 Assert.assertEquals(19.124, mm.divide(9562,500),0.5);
      }
	 
	 /*
	  * unit test that checks a division with a 
	  * negative numerator
	  */
	 @Test
	 public void testDivideShouldDoSimpleNegativeNumDivision() {
	   Assert.assertEquals(-5.0, mm.divide(-10,2),0.5);
	  }
	 
	 /*
	  * unit test that checks a division with a 
	  * negative denominator
	  */
	 @Test
	 public void testDivideShouldDoSimpleNegativeDenomDivision() {
	   Assert.assertEquals(-5.0, mm.divide(10,-2),0.5);
	  }
	    
}