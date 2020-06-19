package Pattern_Part;

public class Pattern_5 {
	
	public static void patt(int n) {
		int i=1;
		
		for(i=1;i<=n;i++){
				for(int j=n;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
		}
		int m=1;
		for(m=1;m<=n;m++) {
			for(int b=1;b<=m+1;b++) {
				System.out.print(" ");
			}
			for(int v=n-1;v>=m;v--) {
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
