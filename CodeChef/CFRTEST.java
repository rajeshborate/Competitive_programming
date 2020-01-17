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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int count=0;
		    for(int k=0;k<n-1;k++){
		        
		        if(arr[k]!=arr[k+1]){
		            count++;
		        }
		    }
		    System.out.println(count+1);
		}
	}
}
