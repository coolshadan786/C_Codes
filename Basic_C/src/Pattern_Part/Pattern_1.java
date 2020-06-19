package Pattern_Part;

public class Pattern_1 {
	
	public static void patt(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m=1;m<=n;m++) {
			for(int b=n-1;b>=m;b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=5;
		patt(n);

	}

}
