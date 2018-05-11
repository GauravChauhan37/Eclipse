package feb8;

import java.util.Scanner;

public class bin2oct {

		public static int bin2octal(int rem){
			int result=0;
			if(rem==111){
				result = 7;}
			else if(rem ==110){
				result = 6;
				}
			else if( rem == 101){
				result = 5;
			}
			else if(rem==100){
				result = 4;
			}
			else if(rem==011){
				result=3;
			}
			else if(rem==010){
				result=2;
			}
			else if (rem==001){
				result =1;
			}
			else if (rem==000){
				result =0;
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
			rem=srcnum % 1000 ;
			int val = bin2octal(rem);
			dn = val *power + dn;
			power = power *10;
			srcnum = srcnum /1000;
			}
		System.out.println(dn);;
	 
		}

	}


