import java.util.*;

public class Count_No_V_C {
	static void count(String s) {
		char[] str=s.toCharArray();
		int len=s.length();
		int count1=0;
		int count2=0;
		
		for(int i=0;i<len;i++) {
			if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||
					str[i]=='O'||str[i]=='u'||str[i]=='U') {
				count1++;
			}else {
				count2++;
			}
		}
		System.out.println("Vowel = " + count1);
		System.out.println("Consatnt = " + count2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			count(s);	
		}
	}
}
