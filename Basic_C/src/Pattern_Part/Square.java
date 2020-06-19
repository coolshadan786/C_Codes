package Pattern_Part;

public class Square {

	public static void patt(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i==1 || i==5|| j==1 || j==5 ||i==5||j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		patt(n);
	}

}
