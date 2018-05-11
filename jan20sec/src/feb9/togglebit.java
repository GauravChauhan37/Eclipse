package feb9;

import java.util.Scanner;

public class togglebit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		byte b = sc.nextByte();
		System.out.println("enter bit");
		byte bit = sc.nextByte();
		byte bitmask = (byte) (1 << bit);
		b= (byte)(b ^ bitmask);
System.out.println(Integer.toBinaryString(b));
	}

}
