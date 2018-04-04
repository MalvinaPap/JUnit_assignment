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
			int[] actual_grades1 = futil.readFile("./src/test/resources/grades1.txt");
			
			Assert.assertArrayEquals(expected_grades1,actual_grades1);
			
			/*2nd file*/
			int[] expected_grades2 = new int[]{1,2,3,4,5,6,7,8,9,10};
			int[] actual_grades2 = futil.readFile("./src/test/resources/grades2.txt");
			
			Assert.assertArrayEquals(expected_grades2,actual_grades2);
			
			/*3rd file (empty file)*/
			int[] expected_grades4 = new int[]{};
			int[] actual_grades4 = futil.readFile("./src/test/resources/grades4.txt");
			
			Assert.assertArrayEquals(expected_grades4,actual_grades4);
			
			
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
	 
	
	  