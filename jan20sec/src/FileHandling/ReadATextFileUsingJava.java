package FileHandling;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class ReadATextFileUsingJava {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("demo.txt")); // if the file is in same package or folder
//			br = new BufferedReader("C:\\User\\pathwithdoubleslashes\\filename.txt"); // to read from a file that is not in same folder
			String line;
			while ((line = br.readLine()) != null) { // read from bufferred Reader until it is empty
				System.out.println(line);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
