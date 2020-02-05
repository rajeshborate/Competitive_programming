/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int rem,n,sum,c1=0,c0=0;
		    String a=sc.next();
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)=='0')
		            c0++;
		        else
		            c1++;
		    }
		    
		    if(c0==1 || c1==1){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    
		    
		}
		
	}
}
