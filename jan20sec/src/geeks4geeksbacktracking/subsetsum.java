package geeks4geeksbacktracking;

public class subsetsum {
	public static void find(int[] a, int start, int sum, int target, String sb) {
		if (target == sum) {
			System.out.println(sb);
		}
		if (start == a.length) {
			return;
		}

		if (sum + a[start] <= target) {
			find(a, start + 1, sum + a[start], target, sb + a[start] + " ");
		}
		find(a, start + 1, sum, target, sb);

	}

	public static void main(String[] args) {
		int[] a = { 10,20,30,40,50,60,70,80,90,100 }; 
		find(a, 0, 0, 80, "");
	}
}
