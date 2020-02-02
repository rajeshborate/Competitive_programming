/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int turns= scan.nextInt();
		    if(turns%2==0){
		        if(a>b)
		            System.out.println(a/b);
		        else
		            System.out.println(b/a);
		    }
		    else{
		        a=a*2;
		        if(a>b)
		            System.out.println(a/b);
		        else
		            System.out.println(b/a);
		    }
		}
		
		
	}
}
