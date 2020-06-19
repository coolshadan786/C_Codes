import java.util.*;
public class Palindrome_Str {
	void palindrome(String s) {
		int len=s.length();
		int i=0;
		int j=len-1;
		int flag=0;
		for(i=0,j=len-1;i<len;i++,j--) {
			if(s.charAt(i)==s.charAt(j) && i!=j) {
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("String is Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			Palindrome_Str p=new Palindrome_Str();
			p.palindrome(s);
		}
	}
}
