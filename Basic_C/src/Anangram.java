import java.util.*;

public class Anangram {
	void ana(String s) {
		int len=s.length();
		int[] hash=new int[26];
		for(int o=0;o<26;o++) {
			hash[o]=0;
		}
		for(int i=0;i<len;i++) {
			hash[s.charAt(i)-'a']++;
		}
		int j=0;
		for(j=0;j<26;j++) {
			if(hash[j]>0) {
				System.out.printf("%c - %d\n", j+'a' ,hash[j]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			Anangram a=new Anangram();
			a.ana(s);
		}

	}

}
