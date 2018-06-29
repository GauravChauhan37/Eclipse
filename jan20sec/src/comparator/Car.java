package comparator;

import java.util.Arrays;

public class Car {

	public static class car implements Comparable<car> {
		int speed;
		int price;
		String name;

		car(int speed, int price, String name) {
			this.speed = speed;
			this.price = price;
			this.name = name;
		}

		@Override   //spellcheck
		public int compareTo(car o) {
//			return this.speed - o.speed; // increasing
			return o.speed - this.speed; // decreasing
		}

		public String toString() {
			return "Speed--> " + this.speed + " Price--> " + this.price + " Name --> " + this.name;
		}

		public static void main(String[] args) {
			car[] c = new car[3];
			c[0] = new car(100, 1000, "a");
			c[1] = new car(10, 2000, "b");
			c[2] = new car(50, 500, "c");
			Arrays.sort(c);
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);
			}
		}
	}
}