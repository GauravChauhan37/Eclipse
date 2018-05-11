package geeksarray;

public class Reverseanarraywithoutaffectingspecialcharacters {
	public static void reverseArray(char[] arr) {
		int start = 0;
		int last = arr.length - 1;
		while (start < last) {
			if (arr[start] >= 'a' && arr[start] <= 'z' && arr[last] >= 'a' && arr[last] <= 'z') {
				char temp = arr[start];
				arr[start] = arr[last];
				arr[last] = temp;
				start++;
				last--;
			} else if (arr[start] >= 'a' && arr[start] <= 'z' && !(arr[last] >= 'a' && arr[last] <= 'z')) {
				last--;
			} else if (!(arr[start] >= 'a' && arr[start] <= 'z') && arr[last] >= 'a' && arr[last] <= 'z') {
				start++;
			} else {
				start++;
				last--;
			}
		}
	}

	public static void main(String[] args) {
		String s = "ab,c,de!$";
		char[] a = new char[s.length()];
		a = s.toCharArray();
		reverseArray(a);
		for (char ch : a) {
			System.out.print(ch + " ");
		}
	}

}
