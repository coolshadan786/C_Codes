import java.util.*;

public class PeakElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			int size=sc.nextInt();
			int[] a=new int[size];
			
			for(int l=0;l<size;l++) {
				a[l]=sc.nextInt();
			}
			
			Arrays.parallelSort(a);
			int x = 0;
			for(int j=0;j<size;j++) {
				System.out.print(a[j] + " ");
				x=j;
			}
			System.out.println();
			System.out.println(x);
		}
	}

}
