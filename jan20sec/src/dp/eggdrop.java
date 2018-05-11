package dp;

public class eggdrop {
	static int counter = 0;

	private static int findNofOfTrails(int noOfFloors, int noOfEggs, int[][] qb) {
		if (noOfFloors == 0) {
			return 0;
		}
		if (noOfFloors == 1) {
			return 1;
		}
		if (noOfEggs == 1) {
			return noOfFloors;
		}
		if (qb[noOfFloors][noOfEggs] != 0) {
			return qb[noOfFloors][noOfEggs];
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int k = 1; k <= noOfFloors; k++) {
			int max1 = findNofOfTrails(k - 1, noOfEggs - 1, qb);
			int max2 = findNofOfTrails(noOfFloors - k, noOfEggs, qb);
			max = (max1 > max2) ? max1 : max2;
			if (min > max) {
				min = max;
			}
		}
		System.out.println(++counter);
		qb[noOfFloors][noOfEggs] = min + 1;
		return min + 1;
	}

	public static void main(String[] args) {
		int noOfFloors = 20;
		int noOfEggs = 2;
		int[][] qb = new int[noOfFloors + 1][noOfEggs + 1];
		System.out.println(findNofOfTrails(noOfFloors, noOfEggs, qb));
	}
}
