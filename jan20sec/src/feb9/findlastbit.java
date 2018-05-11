package feb9;

import java.util.Scanner;

public class findlastbit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		System.out.print(num & -num);

	}

}
