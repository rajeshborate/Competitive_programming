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
		    int m=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int arr[]=new int[101];
		    int c=x*y;
		    for(int i=0;i<m;i++){
		        int a=sc.nextInt();
		        for(int j=0;j<=c;j++){
		            if((a-j)>0)
		                arr[a-j]=1;
		            if((a+j)<=100)
		                arr[a+j]=1;
		            
		        }
		    }
		    int count=0;
		    for(int i=1;i<=100;i++){
		        if(arr[i]==0)
		            count++;
		    }
		    System.out.println(count);
		    
		}
		
	}
}
