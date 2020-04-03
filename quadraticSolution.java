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
		    Quadratic  obj=new Quadratic();
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    obj.quadraticRoots(a,b,c);
		    System.out.println();
		}
		
	}
}
// } Driver Code Ends
//User function Template for Java


class Quadratic 
{
    public void quadraticRoots(int a,int b,int c)
    {
        double d;
        d = b*b - 4*a*c;
        if(d<0){
            System.out.print("Imaginary");
        }
        else{
            double x =(double) (-b + Math.sqrt(d)) / (2 *a);
            double y =(double) (-b - Math.sqrt(d)) / (2 *a);
            
            System.out.printf("%.0f %.0f",Math.floor(x), Math.floor(y));
            
        }
    }
}
