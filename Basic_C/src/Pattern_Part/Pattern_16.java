package Pattern_Part;

public class Pattern_16 {
	
	public void patt(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=1;k<=2*n-2*i;k++) {
				System.out.print(" ");
			}
			for(int m=i;m>=1;m--) {
				System.out.print(m);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern_16 p=new Pattern_16();
		int n=5;
		p.patt(n);
	}

}
