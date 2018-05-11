package searchingandsortingarrays;

public class sortabiglistofdates {
	static class Date {
		int day, mnth, year;

		Date(int day, int mnth, int year) { // constructor
			this.day = day;
			this.mnth = mnth;
			this.year = year;
		}
	}

	public static void main(String[] args) {
		Date[] date = { new Date(20, 1, 2014), new Date(25, 3, 2010), new Date(3, 12, 2000), new Date(18, 11, 2001),
				new Date(19, 4, 2015), new Date(9, 7, 2005) };
		// call radixsort on days
		
		// call rs on mnths
		// call rs on years

	}
}