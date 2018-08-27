package SegmentTree;

public class minOperator implements IRangeOperator {

	@Override
	public int operation(int op1, int op2) {
		return Math.min(op1, op2);
	}

	@Override
	public int identity() {
		return Integer.MAX_VALUE;
	}

}
