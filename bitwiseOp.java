//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

// Function to perform bitwise manipulations
// a, b and c are input integers
class Geeks{
    static void bitWiseOp(int a, int b, int c){
        
        System.out.println(a^a);
        System.out.println(c^b);
        System.out.println(a&b);
        System.out.println(c|(a^a));
        int g = (c^b);
        System.out.println(~g);
        
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    Geeks g = new Geeks();
		    g.bitWiseOp(a, b, c);
		}
	}
}  // } Driver Code Ends
