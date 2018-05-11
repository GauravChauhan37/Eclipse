
public class most_frequentlyoccuringiteminarray {
 
	public static void main(String[] args) {
		int[] a = { 1, 6, 9,6, 5, 1, 6, 1 };
		int maxocc = 0;
		int count = 0;
		int element = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == a[i]) {
					count++;
				}
			}
			if (count > maxocc) {
				maxocc = count;
				element = a[i];
			}
			if (count == maxocc) {
				if(a[i]!=element){
					maxocc = count;
					element = a[i];
					System.out.println("count is" + " " + maxocc + " " + "element is" + " " + element);
				}	
			}
			count = 0;
		}
		System.out.println("count is" + " " + maxocc + " " + "element is" + " " + element);
	}
}
