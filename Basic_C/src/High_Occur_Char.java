import java.util.*;
public class High_Occur_Char {
	static void occur(String s){
		char[] str=s.toCharArray();
		int len=str.length;
		int[] hash=new int[26];
		for(int m=0;m<26;m++) {
			hash[m]=0;
		}
		for(int n=0;n<len;n++) {
			hash[str[n]-'a']++;
		}
		int d=0;
		int i=0;
		int x=0;
		for(i=0;i<26;i++) {
			if(d<hash[i]) {
				d=hash[i];
				x=i;
			}
		}
		System.out.printf("%c - %d\n",x+'a',d);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			occur(s);
		}

	}

}
