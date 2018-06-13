package June12;

public class dynamicStack extends stack {
	public dynamicStack(int cap) {
		super(cap);
	}

	@Override // spell checker
	public void push(int input) {
		if (top == data.length - 1) {
			int[] newData = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			this.data = newData;
		}
		super.push(input);
	}
}
