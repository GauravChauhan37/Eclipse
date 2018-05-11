package hackerrankprobs;

import java.util.ArrayList;
import java.util.Scanner;

public class dynamicarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int lastans = 0;
		ArrayList<Integer> a = new ArrayList<Integer>(N);
		for (int i = 0; i <= N; i++) {
			int x = sc.nextInt();
			lastans = ((i ^ lastans) % N);
		}
		System.out.println(lastans);
	}
}
