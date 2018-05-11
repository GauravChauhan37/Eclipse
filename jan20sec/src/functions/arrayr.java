package functions;

import java.util.Scanner;

public class arrayr {

	public static void main(String[] args) {
		int[] a = { 5, 8, 9, 3, 7 };
		int p,i;
		int rotate=2;
		int[] r = new int[rotate];
		reverse(a,a.length-rotate,a.length-1);
		reverse(a,0,a.length-1-rotate);
		reverse(a,0,a.length-1);
      for(int j=0;j<a.length;j++){
    	 System.out.print(a[j]);
      }
	}

	public static void reverse(int a[], int left, int right) {
		int temp;
		while (left < right) {
			temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}

	}
}
