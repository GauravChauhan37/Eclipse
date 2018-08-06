package practice;

import java.util.Scanner;

public class assd {
	static class Node {
		int data;
		Node next;
	}

	public static void main(String[] args) {
		Node n = new Node();
		Node prev = n;
		Node z = new Node();
		Node next = z;
		System.out.println(n +" "+z);
		String add = prev.toString();
		System.out.println(add);
		long g = Integer.parseInt(add);
		System.out.println(g);
	}

	public static void pbpwith16opening(int src, int dest, String psf, int[] a) {
		if (src == dest) {
			System.out.println(psf);
			return;
		}
		if (src == 0) {
			pbpwith16opening(1, dest, psf + 1, a);
			pbpwith16opening(1, dest, psf + 6, a);
		} else {
			if (a[src] != 0) {
				pbpwith16opening(a[src], dest, psf + "[" + src + "->" + a[src] + "]", a);
			} else {
				for (int dice = 1; dice <= 6; dice++) {
					int inter = src + dice;
					if (inter <= dest) {
						pbpwith16opening(inter, dest, psf + dice, a);
					}
				}
			}
		}
	}
}
