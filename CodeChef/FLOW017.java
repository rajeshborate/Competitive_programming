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
	   int a[]=new int[3];
	   while(t-->0)
	   {
	       for(int i=0;i<3;i++)
	       a[i]=sc.nextInt();
	       Arrays.sort(a);
	       System.out.println(a[1]);
	   }
	}
}
