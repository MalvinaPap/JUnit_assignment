package dmst.seip.MalvinaPap.unit_testing;

import java.io.FileNotFoundException;
import java.io.IOException;

/** 
 * 
 * @author Malvina
 */
public class MyArrayOperations {
    
	/**
	 * This method uses method readFile in order
	 * to get an array with grades. After that it
	 * uses a loop to count the frequency of each
	 * grade
	 * @param filepath
	 * @param utils
	 * @return int[]
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public int[] gradeFrequencies(String filepath, MyFileUtilities utils) throws IOException, FileNotFoundException {
		
		/* read grades from the file*/
		int[] grades = utils.readFile(filepath);
		/*initialize frequencies for grades 0-10 to zero */
		int[] freqs = new int[]{0,0,0,0,0,0,0,0,0,0,0}; 
		
		/*count frequency for all grades*/
		for (int i=0 ; i< grades.length ; ++i) {
			++freqs[grades[i]];
		}
		
		return freqs;
		
	}
}
