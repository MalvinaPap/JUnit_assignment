package dmst.seip.MalvinaPap.unit_testing;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalArgumentException;


/**
 * 
 * @author Malvina
 *
 */
public class MyFileUtilities {

	/**
	 * This method gets a filepath in string format
	 * reads a file with grades and creates an array
	 * that contains all the grades found in the file
	 * @param Filepath
	 * @return int[]
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public int[] readFile(String Filepath) throws IOException, FileNotFoundException {
		
		List<Integer> grades = new ArrayList<Integer>();
		String strLine;
		try {
			FileInputStream fstream = new FileInputStream(Filepath);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			while ((strLine = br.readLine()) != null)   {
				int grade = Integer.parseInt(strLine);
				grades.add(grade);
		    }		
			br.close();
			
		} catch (Exception e) {
			throw new IllegalArgumentException("Error while reading the file.");
		} 
		
		int[] gds = new int[grades.size()];
		for (int i=0; i < gds.length; i++)  {
	        gds[i] = grades.get(i);
	    }
		return gds;
	}
		
		
}
