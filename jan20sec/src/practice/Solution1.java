package practice;
import java.io.*;
import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            int some=sc.nextInt();
            a[i] =  some;
        }
		revarr(a);
    }
    public static void revarr(int[] a){
		int[] rev = new int[a.length];
        boolean flag = true;
		for(int i =0;i<a.length;i++){
			rev[a[i]]=i;
			
		}
		for(int i =0;i<rev.length;i++){
		System.out.print(rev[i]);
		}
        for(int k=0,l=0;k<a.length;k++,l++){
            if(a[k]!=rev[l]){
                flag = false;
            }
        }
        if(flag==true){
            System.out.println(flag);
        }
        else{
            System.out.println(flag);
        }
    }
    
}
