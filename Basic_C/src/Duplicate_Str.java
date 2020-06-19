import java.util.*;

public class Duplicate_Str {
	static void duplicate(String s) {
		char[] str=s.toCharArray();
		int len=str.length;
		char[] c=new char[len];
		int m=0;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				for(int l=0;l<len;l++) {
					if(str[i]==str[l] && i!=l)
						continue;
					else if(str[i]!=str[j] && j==len-1 && i!=j){
						c[m]=str[i];
						System.out.println(c[m]);
						m++;
					}else if(i==len-1 && str[i]!=str[j] && j==len-2) {
						c[m]=str[i];
						System.out.println(c[m]);
						m++;
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			duplicate(s);
			
		}

	}

}
