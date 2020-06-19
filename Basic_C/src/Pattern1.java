import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			int n=sc.nextInt();
			int z=1;
			for(int i=0;i<n;i++) {
				for(int j=n/2;n>0;j++) {
					System.out.println(z++);
				}
				System.out.println(" ");
			}
		}
	}

}
                       