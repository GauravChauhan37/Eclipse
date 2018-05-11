
public class inverse {

	public static void main(String[] args) {
		int[] a={1,3,2,0,4};
		int[] rev = new int[5]; 
		for(int i =0;i<a.length;i++){
			rev[a[i]]=i;
			
		}
		for(int i =0;i<rev.length;i++){
		System.out.print(rev[i]);
		}
	}

}
