package SegmentTree;

public class Client {

	public static void main(String[] args) {
		// int[] arr = {2, -5, 4, 11, -7, 6, 3, 8};
		// FenwickTree ft = new FenwickTree(arr);
		// System.out.println(ft.query(2, 5));
		// ft.update(3, -5);
		// System.out.println(ft.query(2, 5));

		// SegmentTree st = new SegmentTree(arr, new ProductRangeOperator());
		// st.display();
		//
		// System.out.println(st.query(2, 4));
		// st.update(4, 15);
		// System.out.println(st.query(2, 4));

		Integer[][] graph = new Integer[4][4];
		graph[0][1] = 3;
		graph[1][2] = 3;
		graph[2][3] = 2;
		graph[0][3] = 10;

		floydwarshall(graph);
	}

	private static class SumRangeOperator implements IRangeOperator {
		@Override
		public int operation(int op1, int op2) {
			return op1 + op2;
		}

		@Override
		public int identity() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	private static class ProductRangeOperator implements IRangeOperator {
		@Override
		public int operation(int op1, int op2) {
			return op1 * op2;
		}
