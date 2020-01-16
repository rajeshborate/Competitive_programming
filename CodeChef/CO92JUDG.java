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
		    int n=sc.nextInt();
		    int[] arr1=new int[n];
		    int[] arr2=new int[n];
		    int sum1=0,sum2=0;
		    for(int i=0;i<n;i++){
		        arr1[i]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        arr2[j]=sc.nextInt();
		    }
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    for(int k=0;k<n-1;k++){
		        sum1=sum1+arr1[k];
		        sum2=sum2+arr2[k];
		    }
		    if(sum1>sum2)
		        System.out.println("Bob");
		    else if(sum1<sum2)
		        System.out.println("Alice");
		    else
		        System.out.println("Draw");
		}
	}
}
