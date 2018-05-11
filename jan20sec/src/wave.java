
public class wave {

	public static void main(String[] args) {
		int[][] a = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, };
		dis(a);
	}

	public static void dis(int[][] a) {
		int col = 0, row = 0;
		int dir = 0;
		while (col < a[0].length) {
			// first case
			if (dir % 2 == 0) {
				while (row < a.length) {
					System.out.print(a[row][col]);
					row++;
				}
			} else { 
				row--;
				while (row >= 0) { 
					System.out.print(a[row][col]);
					if(row>0){row--;}
					else{break;}
				}
			}
			dir++;
			col++;
		}
	}

}
