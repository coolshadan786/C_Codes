import java.util.*;

public class Union {
	static void union(int a[],int b[]) {
		int len1=a.length;
		int len2=b.length;
		int w=len1+len2;
		int[] c=new int[w];
		int[] c1=new int[w];
		int k=0;
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len1;j++) {
				if(a[i]!=a[j] && j==len1-1 && i!=j) {
					c[k]=a[i];
					System.out.print(c[k]);
					k++;
				}else if(i==len1-1 && a[i]!=a[j] && j==len1-2) {
					c[k]=a[i];
					System.out.print(c[k]);
					k++;
				}
			}
		}
		for(int m=0;m<len2;m++) {
			for(int n=0;n<len2;n++) {
				if(b[m]!=b[n] && n==len2-1 && m!=n) {
					c[k]=b[m];
					System.out.print(c[k]);
					k++;
				}else if(m==len2-1 && b[m]!=b[n] && n==len2-2) {
					c[k]=b[m];
					System.out.print(c[k]);
					k++;
				}
			}
		}
		System.out.println();
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		int g=0;
		for(int q=0;q<w;q++) {
			for(int d=q+1;d<w;d++) {
				if(c[q]!=c[d]) {
					c[g]=c[q];
					System.out.print(c[g] + " ");
					g++;
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			System.out.println("Enter size1");
			int size1=sc.nextInt();
			int size2;
			int[] a=new int[size1];
			
			for(int y=0;y<size1;y++) {
				System.out.println("Enter the A data");
				a[y]=sc.nextInt();
			}
			System.out.println("Enter size2");
			size2=sc.nextInt();
			int[] b=new int[size2];
			for(int o=0;o<size2;o++) {
				System.out.println("Enter the B data");
				b[o]=sc.nextInt();
			}
			union(a,b);
		}
			
	}

}
