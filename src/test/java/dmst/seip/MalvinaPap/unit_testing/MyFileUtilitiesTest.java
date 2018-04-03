package dmst.seip.MalvinaPap.unit_testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * An class that provides test cases for the 
 * operations of the MyFileUtilities
 * class
 * @author Malvina
 */
public class MyFileUtilitiesTest {
	
	
	MyFileUtilities futil = new MyFileUtilities(); /*create MyFileUtilities Object for the tests*/
	
	/*
	 * unit test that a simple case when method
	 * reads a file and returns an array with the grades
	 */
	@Test 
    public void testReadFileShouldReturnArrayWithGrades1 () throws IOException, FileNotFoundException {
			
			/*1st file*/
			int[] expected_grades1 = new int[]{4,6,7,5,7,6,9,10,10,5,6,7,7,7,8,9,5,8,9,8,8,9,6};
			int[] actual_grades1 = futil.readFile("C:\\Users\\admin\\Desktop\\JUnit_assignment\\src\\test\\resources\\grades1.txt");
			
			/*check if expected array legth matches actual one*/
			Assert.assertEquals(expected_grades1.length,actual_grades1.length);
			
			/*check contents one by one*/
			for (int i=0;i< expected_grades1.length; ++i) {
				Assert.assertEquals(expected_grades1[i],actual_grades1[i]);
			}
			
			
			/*2nd file*/
			int[] expected_grades2 = new int[]{1,2,3,4,5,6,7,8,9,10};
			int[] actual_grades2 = futil.readFile("C:\\Users\\admin\\Desktop\\JUnit_assignment\\src\\test\\resources\\grades2.txt");
			
			/*check if expected array legth matches actual one*/
			Assert.assertEquals(expected_grades2.length,actual_grades2.length);
			
			/*check contents one by one*/
			for (int i=0;i< expected_grades2.length; ++i) {
				Assert.assertEquals(expected_grades2[i],actual_grades2[i]);
			}
			
			
    } 
	
	

	/*
	 * unit test tests if exception 
	 * handling is correct
	 */
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	@Test 
	public void readFileShouldCauseException() throws IOException, FileNotFoundException {
		thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("Error while reading the file.");
	    futil.readFile("some\\non\\existent\\path");
	}
	 
	 
	 
}	
	 
	
	  