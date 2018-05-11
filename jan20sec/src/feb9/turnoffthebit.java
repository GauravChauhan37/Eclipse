package feb9;

import java.util.Scanner;

public class turnoffthebit {

	public static void main(String[] args) {
		//onbit
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		byte b = sc.nextByte();
		System.out.println("enter bit");
		byte bit = sc.nextByte();
		byte bitmask = (byte) (1 << bit);
		b= (byte)(b | bitmask);
System.out.println(Integer.toBinaryString(b));
	}

}
