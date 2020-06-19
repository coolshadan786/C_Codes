import java.util.*;

public class Reverse_String {
	static void reverse(String s) {
		char[] str=s.toCharArray();
		int len=str.length;
		int i=0;
		int j=len-1;
		for(;j>=0;j--) {
			System.out.print(str[j]);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			reverse(s);
		}

	}

}
