package SegmentTree;

public class maxOperator implements IRangeOperator {

	@Override
	public int operation(int op1, int op2) {
		return Math.max(op1, op2);
	}

	@Override
	public int identity() {
		return Integer.MIN_VALUE;
	}

}
