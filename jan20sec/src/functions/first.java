package functions;

import java.util.Scanner;

public class first {
public static void f(int num,int sum){
	num= 5;
	sum =6;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		f(a,b);
		System.out.println(a+" "+b);
	}

}
