package dmst.seip.MalvinaPap.unit_testing;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * An class that provides test cases for the 
 * operations of the MyArrayOperations
 * class
 * @author Malvina
 */

public class MyArrayOperationsTest {
	
	MyArrayOperations opers = new MyArrayOperations();
	
	/**
	 * This test method checks if method
	 * gradeFrequencies works correctly. For 
	 * this purpse method readFile gets mocked
	 * so that it does not affect the result of
	 * the test. 2 files are used for the test.
	 */
	@Test
	public void gradefrequenciesMocking() throws IOException, FileNotFoundException {
		// Mock the MyFileUtilities dependency
		MyFileUtilities utils = mock(MyFileUtilities.class);
		int[] gd1 = new int[]{4,6,7,5,7,6,9,10,10,5,6,7,7,7,8,9,5,8,9,8,8,9,6};
		int[] gd2 = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] gd3 = new int[]{8,8,8,8,7,7};
		
		// Pre-define the results of the readFile calls
		when(utils.readFile("grades1.txt")).thenReturn(gd1);
		when(utils.readFile("grades2.txt")).thenReturn(gd2);
		when(utils.readFile("grades3.txt")).thenReturn(gd3);
		
		Assert.assertArrayEquals(new int[]{0,0,0,0,1,3,4,5,4,4,2},opers.gradeFrequencies
				("grades1.txt",utils));
		Assert.assertArrayEquals(new int[]{0,1,1,1,1,1,1,1,1,1,1},opers.gradeFrequencies
				("grades2.txt",utils));
		Assert.assertArrayEquals(new int[]{0,0,0,0,0,0,0,2,4,0,0},opers.gradeFrequencies
				("grades3.txt",utils));
	}
}
