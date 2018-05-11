package feb9;

public class bitmanipulation {

	public static void main(String[] args) {
		byte b = 57;
		byte bit = 6;
		byte bitmask = (byte) (1 << bit);
		if ((b & bitmask) == 0) {
			System.out.println("false");
		} else {
			System.out.println("true");

		}
	}
}
