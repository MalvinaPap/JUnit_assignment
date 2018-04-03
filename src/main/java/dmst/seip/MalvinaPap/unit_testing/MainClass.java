package dmst.seip.MalvinaPap.unit_testing;

import java.io.FileNotFoundException;
import java.io.IOException;


public class MainClass {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		MyFileUtilities futil= new MyFileUtilities();
		int[] array = futil.readFile("..\\JUnit_assignment\\src\\est\\resources\\grades1.txt");
		System.out.print(array);
	}

}
