package HuffmannEncoding;

public class client {

	public static void main(String[] args) {
		HuffMan h = new HuffMan("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbcccd");
		h.encoder("aaabcdaa");
		h.decode("1110100100011");
	}

}
