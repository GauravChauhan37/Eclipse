package feb8;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source num");
		int srcnum = sc.nextInt();
	    int srcbase = 2; int db =10;
		int rem =0,power = 1; int result =0;
		while(srcnum!=0) {
		rem=srcnum % db ;
		srcnum = srcnum /db;
		result= result +  rem * power ;
		power = power * srcbase;
		} 
		System.out.println(result);
	}

}
