package graph;

import java.util.HashSet;

public class Hamiltonian { // dfs

	public static void main(String[] args) {
		int[][] mat = new int[7][7];
		mat[0][1] = 10;
		mat[1][0] = 10;
		mat[1][2] = 10;
		mat[2][1] = 10;
		mat[2][3] = 10;
		mat[3][2] = 10;
		mat[0][3] = 40;
		mat[3][0] = 40;
		mat[3][4] = 2;
		mat[4][3] = 2;
		mat[4][5] = 3;
		mat[5][4] = 3;
		mat[5][6] = 3;
		mat[6][5] = 3;
		mat[4][6] = 8;
		mat[6][4] = 8;
		mat[2][5] = 5; // hamil cycle
		mat[5][2] = 5;
		HashSet<Integer> hs = new HashSet<>();
		hs.add(2);
		hamil(mat, hs, 2, 2 + "-->", 2);
	}

	private static void hamil(int[][] arr, HashSet<Integer> visited, int src, String psf, int osrc) {
		if (visited.size() == arr.length) {
			System.out.println("HP" + "--> " + psf);
			if (arr[src][osrc] != 0) {
				System.out.println("And a HC");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < arr[0].length; i++) {
			if (arr[src][i] != 0) {
				if (!(visited.contains(i))) {
					visited.add(i);
					hamil(arr, visited, i, psf + i + "-->", osrc);
					visited.remove(i);
				}
			}
		}
	}
}
