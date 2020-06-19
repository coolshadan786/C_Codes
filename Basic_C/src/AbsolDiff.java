import java.util.*;

public class AbsolDiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			int size=sc.nextInt();
			int[] a=new int[size];
			
			for(int i=0;i<size;i++) {
				a[i]=sc.nextInt();
			}
			int mid=(a.length)/2;
			
			int temp1=0,temp2=0;
			for(int j=0;j<mid;j++) {
				temp1+=a[j];
			}
			for(int m=mid;m<a.length;m++) {
				temp2+=a[m];
			}
			System.out.println(temp1 + " " + temp2);
			int sub=(temp1>temp2?temp1-temp2:temp2-temp1);
			System.out.println(sub);
		}

	}

}
