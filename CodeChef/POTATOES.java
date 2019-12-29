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
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int sum=a+b;
		    int d=0;
		    while(d==0){
		        sum=sum+1;
		        int c=0;
		        for(int j=2;j<=sum/2;j++){
		            if(sum%j==0){
		                c++;
		            }
		        }
		        if(c==0)
		        d=1;
		    }
		    System.out.println(sum-a-b);
		   
		}
	}

}
