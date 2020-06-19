import java.util.*;

public class Non_Repeated_Char {
	public void repeat(String s) {
		char[] str=s.toCharArray();
		int len=str.length;
		char k=0;
		int count=0;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(str[i]==str[j] && i!=j)
					break;
				if(str[i]!=str[j] && j==len-1) {
						count++;
				}else if(i==len-1 && str[i]!=str[j] && j==len-2) {
						count++;
				}
			}if(count==1) {
				k=str[i];
				System.out.println(k);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String s=sc.next();
			Non_Repeated_Char n=new Non_Repeated_Char();
			n.repeat(s);
		}
	}
}
