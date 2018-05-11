package searchingandsortingarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class fourdistinctelementsthatsumtoagivenvalue {
	static class cool implements Comparable<cool> {
		int sum;
		int value1;
		int value2;

		public int compareTo(cool o) {
			return this.sum - o.sum;
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int[] a = new int[arrSize];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int valueToFind = sc.nextInt();
		cool[] aux = new cool[(a.length * a.length - 1) / 2];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = new cool();
		}
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				aux[k].sum = a[i] + a[j];
				aux[k].value1 = a[i];
				aux[k].value2 = a[j];
				k++;
			}
		}
		Arrays.sort(aux);
		int i = 0, j = aux.length - 1;
		HashSet<String> h = new HashSet<>();
		while (i < j) {
			if (aux[i].sum + aux[j].sum == valueToFind) {
				if (aux[i].value1 != aux[j].value1 && aux[i].value1 != aux[j].value2 && aux[i].value2 != aux[j].value1
						&& aux[i].value2 != aux[j].value2) {
					ArrayList<Integer> al = new ArrayList<>();
					al.add(aux[i].value1);
					al.add(aux[i].value2);
					al.add(aux[j].value1);
					al.add(aux[j].value2);
					Collections.sort(al);
					String s = "";
					for (Integer val : al) {
						s += val;
					}
					if (h.contains(s) == false) {
						int[] arr = new int[4];
						arr[0] = aux[i].value1;
						arr[1] = aux[i].value2;
						arr[2] = aux[j].value1;
						arr[3] = aux[j].value2;
						Arrays.sort(arr);
						for (int z = 0; z < arr.length; z++) {
							System.out.print(arr[z] + " ");
						}
						System.out.println();
						h.add(s);
					}
				}
				i++;
				j--;
			} else if (aux[i].sum + aux[j].sum < valueToFind) {
				i++;
			} else if (aux[i].sum + aux[j].sum > valueToFind) {
				j--;
			}

		}
	}
}
