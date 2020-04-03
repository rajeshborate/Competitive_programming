// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Factorial obj=new Factorial();
		    int N;
		    N=sc.nextInt();
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends
//User function Template for Java


class Factorial
{
    public static double M_E = 2.71828182845904523536; 
    public static double M_PI = 3.141592654;
    
    public long digitsInFactorial(int N)
    {
        if (N < 0) 
            return 0; 
  
        // base case 
        if (N <= 1) 
            return 1; 
  
        // Use Kamenetsky formula to calculate 
        // the number of digits 
        double x = (N * Math.log10(N / M_E) + 
                    Math.log10(2 * M_PI * N) /  
                    2.0); 
  
        return (long)Math.floor(x) + 1;
        
    }

}
