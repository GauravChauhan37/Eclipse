package jan20sec;

import java.util.Scanner;

public class funwithchar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
        if((ch>='a') && ch<='z'){
        	System.out.println("lower");
        }
        else if ((ch>='A') && (ch<='Z')){
        	System.out.println("upper");
        }
        else {
        	System.out.println("invalid");
        }
	}

}
