package linkedlist;

public class mainclass {

	public static void main(String[] args) {
		Link2 s = new Link2();
		s.insert(100);
		s.insert(90);
		s.insert(902);
		s.insert(3556);
		s.insert(3232);
		s.insert(86856);
		s.display();
		System.out.println();
		s.delete();
		s.display();
		System.out.println();
		s.insertinmiddle(5);
		s.display();
	}

}
