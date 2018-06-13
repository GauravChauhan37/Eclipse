package June12;

public class dynamicQueue extends queue {

	public dynamicQueue(int cap) {
		super(cap);
	}

	@Override
	public void enqueue(int input) {
		if (size == data.length) {
			int[] newData = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				newData[i + front] = data[(i + front) % data.length];
			}
			this.data = newData;
		}
		super.enqueue(input);
	}
}
