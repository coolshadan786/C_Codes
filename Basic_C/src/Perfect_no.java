import java.util.*;
public class Perfect_no {
	
	public void perfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Perfect_no p=new Perfect_no();
		int n=sc.nextInt();
		p.perfect(n);

	}

}
