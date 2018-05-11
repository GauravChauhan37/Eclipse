package dppractice;

public class eggDrop {
	private static int eggDrop(int noOfFloors, int noOfEggs) {
		if (noOfFloors == 1) {
			return 1;
		}
		if (noOfEggs == 1) {
			return noOfFloors;
		}
		if (noOfFloors == 0) {
			return 0;
		}
		int res = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= noOfFloors; i++) {
			int eggbreaks = eggDrop(i - 1, noOfEggs - 1);
			int eggdntbreaks = eggDrop(noOfFloors - i, noOfEggs);
			res = Math.max(eggbreaks, eggdntbreaks);
			if (min > res)
				min = res;
		}
		return min + 1;
	}

	public static void main(String[] args) {
		int noOfFloors = 5;
		int noOfEggs = 2;
		System.out.println(eggDrop(noOfFloors, noOfEggs));
	}

}
