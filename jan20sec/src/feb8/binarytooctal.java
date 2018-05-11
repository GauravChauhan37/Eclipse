package feb8;

import java.util.Scanner;

public class binarytooctal {
	public static int octToBin(int rem){
		int result = 0;
		if(rem==0){
			result = 0;}
		else if(rem ==1){
			result = 1;
			}
		else if( rem == 2){
			result = 10;
		}
		else if(rem==3){
			result = 11;
		}
		else if(rem==4){
			result=100;
		}
		else if(rem==5){
			result=101;
		}
		else if (rem==6){
			result =110;
		}
		else if (rem==7){
			result =111;
		}
		return result;
	}

	public static void main(String[] args) {
		int rem =0;
		int power = 1;
		int dn=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter source num");
	int srcnum= sc.nextInt();
	while(srcnum!=0) {
		rem=srcnum % 10 ;
		int val = octToBin(rem);
		dn = val *power + dn;
		power = power *1000;
		srcnum = srcnum /10;
		}
	System.out.println(dn);;
 
	}

}
