
public class mergesort {
	public static int[] mergesortedarrays(int[] one, int[] two) {
		int i = 0, j = 0;
		int k = 0;
		int[] three = new int[one.length + two.length];
		while (i < one.length && j < two.length) {
			if (one[i] <= two[j]) {
				three[k] = one[i];
				i++;
			}else{
				three[k] = two[j];
				j++;
			}
			k++;
		}
			for(int in = i ; in<one.length;in++){
				three[k] = one[in];
				k++;
			}
			for(int in = j ; in<two.length;in++){
				three[k] = two[in];
				k++;
			}
		return three;
	}

	public static void main(String[] args) {
		int[] one = { 10, 20, 30, 40, 50 };
		int[] two = { 11, 15, 21, 25, 29, 35 };
		int[] result = mergesortedarrays(one, two);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}

}
