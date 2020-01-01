/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
    	int t = s.nextInt();
    	while(t-->0) {
    		 int n=s.nextInt();
    		    int a[]=new int[n];
    		    for(int i=0;i<n;i++)
    		        a[i]=s.nextInt();
    		    int c,p,count=0;
    		    for(int i=0;i<n;i++){
    		        c=0;
    			    p=1;
    		        for(int j=i;j<n;j++){
    		            c=c+a[j];
    		            p=p*a[j];
    		            if(c == p)
    		                count++;
    		        }
    		    }
    		    System.out.println(count);
    	}
	}
}
