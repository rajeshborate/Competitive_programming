/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,c=0;
		long m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    m=sc.nextLong();
		  c=0;
		for(int j=2;j<=m/2;j++)
		{ 
		  if(m%j==0)
		  {
		      c++;
		      
		  }
		}
		  if(c==0)
		   System.out.println("yes");
		      else
		        System.out.println("no");
		}
	}
}
