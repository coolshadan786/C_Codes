package Pattern_Part;

public class Pattern_3 {
	
	public static void patt(int n) {
		int i=1;
		for(i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
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
