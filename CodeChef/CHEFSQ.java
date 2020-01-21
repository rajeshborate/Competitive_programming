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
		
		for(int i=0;i<n;i++){
		    arr1[i]=sc.nextInt();
		}
		
		int m=sc.nextInt();
		int[] arr2=new int[m];
		
		for(int j=0;j<m;j++){
		    arr2[j]=sc.nextInt();
		}
		
		int c=m;
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        if(j>=n || i>=m){
		                break;
		            }
		        if(arr2[i]==arr1[j]){
		                while((j<n && i<m) && arr2[i]==arr1[j] ){
		                    i++;j++;
		                    c-=1;
		                }
		            
		        }
		    }
		}
		if(c==0)
		    System.out.println("Yes");
	    else
	        System.out.println("No");
		
		
		
		
	}
	}
}
