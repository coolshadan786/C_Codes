import java.util.*;
public class Avg15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			int n=sc.nextInt();
			int sum=0;
			for(int j=0;j<=n;j++) {
				if(j%3==0 && j%5==0) {
					sum+=j;
					System.out.print(j + " ");
				}
			}
			System.out.println();
			
			System.out.println(sum);
		}

	}

}
