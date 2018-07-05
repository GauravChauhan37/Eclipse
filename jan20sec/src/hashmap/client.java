package hashmap;

public class client {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap();
		h.put("india", 100);
		h.put("pak", 10);
		h.put("china", 200);
		h.put("buck", 1000);
		h.put("duck", 50);
		h.display();
		h.put("indo", 200);
		h.put("austria", 1000);
		h.put("UK", 50);
		h.put("US", 90);
		h.put("narnia", 80);
		h.display();
	}
}
