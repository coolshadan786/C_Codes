package Pattern_Part;

public class Pyramid {

	public static void pyramidPattern(int n) { 
	    	int i=1;
	        for ( i=1; i<=n; i++){/*outer loop for number of rows(n)*/
	        	for (int j=n; j>=i; j--) {//inner loop for spaces
	                System.out.print(" "); //print space
	            }  
	            for (int j=1; j<=i; j++ ) { //inner loop for number of column
	                System.out.print("* "); //print star
	            } 	  
	            System.out.println(); //ending line after each row
	       }  
	   } 
	  
	    public static void main(String args[]) //driver function
	    { 
	        int n = 5; 
	        pyramidPattern(n); 
	    } 
	}
