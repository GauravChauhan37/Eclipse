package jan20sec;

import java.util.Scanner;

public class fibpattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,prev=0,curr=1,next;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(prev+" ");
				next = prev+curr;
				prev= curr;
				curr= next;
			}
			System.out.println();
			
		}
		// TODO Auto-generated method stub

	}

}
