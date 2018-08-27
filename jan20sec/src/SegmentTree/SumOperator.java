package SegmentTree;

public class SumOperator implements IRangeOperator {

	@Override
	public int operation(int op1, int op2) {
		return op1 + op2;
	}

	@Override
	public int identity() {
		return 0;
	}

}
