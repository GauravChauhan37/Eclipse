package searchingandsortingarrays;

import java.util.ArrayList;
import java.util.Scanner;

public class mergeoverlappingintvrals {
	static class arrs {
		int firstIndex;
		int scndIndex;
	}

	public static void merge(arrs[] arr) {
		ArrayList<arrs> stack = new ArrayList<arrs>();
		stack.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			arrs tos = stack.get(stack.size() - 1);
			arrs curr = arr[i];
			if (curr.firstIndex >= tos.firstIndex && curr.firstIndex <= tos.scndIndex) {
				tos.scndIndex = curr.scndIndex > tos.scndIndex ? curr.scndIndex : tos.scndIndex;
			} else {
				stack.add(curr);
			}
		}
		for (arrs arrs : stack) {
			System.out.println(arrs.firstIndex + " " + arrs.scndIndex);
		}
	}

	public static void main(String[] args) {
		arrs[] arr = new arrs[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new arrs();
		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i].firstIndex = sc.nextInt();
			arr[i].scndIndex = sc.nextInt();
		}
		sc.close();
		merge(arr);
	}
}
