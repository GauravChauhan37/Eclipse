package practice;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		int total = 1, i = 0, rem = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first num");
		int firstnum = sc.nextInt();
		System.out.println("enter scnd num");
		int scndnum = sc.nextInt();
		i = 2;
		while (firstnum != 1 || scndnum != 1) {   // i used && here, if first and scnd both not equals 1 then exit 
			if (firstnum % i == 0) {
				rem = i;
				firstnum /= i;
			} else if (scndnum % i == 0) {
				rem = i;
				scndnum /= i;
			} else {
				rem = 1;
			}
			total = total * rem;
			i++;
		}
		System.out.println(total);
	}
}
