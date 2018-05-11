package practice;

//Java program to Rearrange positive 
//and negative numbers in a array
import java.io.*;

public class GFG {
	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	static void RearrangePosNeg(int arr[], int n) {
		int key, j;
		for (int i = 1; i < n; i++) {
			key = arr[i];
			if (key > 0) {
				continue;
			}
			j = i - 1;
			while (j >= 0 && arr[j] > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int n = arr.length;
		RearrangePosNeg(arr, n);
		printArray(arr, n);

	}
}