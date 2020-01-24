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
		    int[] l=new int[n];
		    int[] r=new int[n];
		    for(int i=0;i<n;i++){
		        l[i]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        r[j]=sc.nextInt();
		    }
		    int arr[]=new int[n];
		    for(int k=0;k<n;k++){
		        arr[k]=l[k]*r[k];
		    }
		    int max=0;
		    int in=0;
		    for(int p=0;p<n;p++){
		        if(arr[p]>max){
		            max=arr[p];
		            in=p;
		        }
		        else if(arr[p]==max && r[p]>r[in]){
		            in=p;
		        }
		    }
		    System.out.println(in+1);
		    
		}
		
		
	}
}
