package Pattern_Part;

public class Star_Pyramid2 {

	public static void patt(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--) {
				System.out.print("*");
			}
			for(int l=n;l>=i+1;l--) {
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
