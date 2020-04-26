//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Geeks{
    
    static void logicOp(boolean a, boolean b){
        System.out.println((a && b)+" " + (a||b) +" " + ((!a)&&(!b)) );
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    boolean a = sc.nextBoolean();
		    boolean b = sc.nextBoolean();
		    
		    Geeks g = new Geeks();
		    g.logicOp(a, b);
		}
	}
}  // } Driver Code Ends
