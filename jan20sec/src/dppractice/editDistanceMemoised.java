package dppractice;

public class editDistanceMemoised {
	private static int countNoOfOperations(String first, String scnd) {
		int noOfOperation = 0;
		if (scnd.length() == 0) {
			return first.length();
		} else if (first.length() == 0) {
			return scnd.length();
		}
		if (first.charAt(0) == scnd.charAt(0)) {
			noOfOperation += countNoOfOperations(first.substring(1), scnd.substring(1));
		} else {
			int firstop = 1 + countNoOfOperations(first.substring(1), scnd.substring(1)); // replace
			int scndop = 1 + countNoOfOperations(first, scnd.substring(1)); // insert
			int thirdop = 1 + countNoOfOperations(first.substring(1), scnd); // delete
			noOfOperation = Math.min(firstop, Math.min(scndop, thirdop));
		}
		return noOfOperation;
	}

	public static void main(String[] args) {
		String s = "abcd";
		String sc = "dbcad";
		int noOfOperations = countNoOfOperations(s, sc);
		System.out.println(noOfOperations);
	}
}
