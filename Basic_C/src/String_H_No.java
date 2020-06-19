import java.util.*;

public class String_H_No {
	void no(String s) {
		char[] st=s.toCharArray();
		char[] c=new char[20]; 
		int len=st.length;
		int sum=0;
		int k=0;
		for(int i=0;i<len;i++){
			if(st[i]>='0' && st[i]<='9'){
				c[k]=st[i];
				sum=sum+c[k];
				System.out.print(c[k]);
				k++;
			}
		}
		System.out.println();
		System.out.println(sum);
 	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			String_H_No n=new String_H_No();
			n.no(s);
		}
				

	}

}
