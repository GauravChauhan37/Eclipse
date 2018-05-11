package searchingandsortingarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class medianinstreamofinteger {
	public static void findMedian(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) > arr.get(j)) {
					int temp = arr.get(i);
					int temp2 = arr.get(j);
					arr.set(i, temp2);
					arr.set(j, temp);
				}
			}
		}
		if (arr.size() % 2 != 0) {
			int var = arr.size() / 2;
			System.out.println(arr.get(var));
		} else {
			int var = arr.size() / 2;
			int var2 = (arr.size() / 2) - 1;
			System.out.println((arr.get(var) + arr.get(var2)) / 2);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			arr.add(n);
			findMedian(arr);
		}
	}
}