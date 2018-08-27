package FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		try {
			// this code will create a demo file txt format
		FileOutputStream f = new FileOutputStream("demo.txt");
		DataOutputStream d = new DataOutputStream(f);
		// now next line will write particular string in the file
		d.writeUTF("Demo Contnt");
		d.writeUTF("hello  this is line one");
		}catch(FileNotFoundException ex) {
			System.out.println(ex);
		}
		// to read from that file
		FileInputStream fi = new FileInputStream("demo.txt");
		DataInputStream di = new DataInputStream(fi);
		String str = di.readUTF();
		System.out.println(str);
	}
}
