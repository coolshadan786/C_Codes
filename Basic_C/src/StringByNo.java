import java.util.*;
public class StringByNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			String str=sc.next();
			str=str+sc.nextLine();
			char[] st=str.toCharArray();
			int len=st.length;
			System.out.println("N no is");
			int n=sc.nextInt();
			for(int j=0;j<len;j++) {
				if(st[j]>='a' && st[j]<='v') {
					st[j]=(char) (st[j]+n);
				}else if(st[j]>='w' && st[j]<='z') {
					st[j]=(char) (st[j]-26+n);
				}else if(st[j]>='A' && st[j]<='V') {
					st[j]=(char) (st[j]+n);
				}else if(st[j]>='W' && st[j]<='Z') {
					st[j]=(char) (st[j]-26+n);
				}
			}
			for(int b=0;b<len;b++) {
				System.out.print(st[b]);
			}
			System.out.println();			
		}
	}
}
