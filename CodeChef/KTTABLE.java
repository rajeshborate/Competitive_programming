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
		    for(int i=0;i<n;i++){
		        arr1[i]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        arr2[j]=sc.nextInt();
		    }
		    
		    int tot=0;
		    if(arr1[0]>=arr2[0]){
		        tot++;
		    }
		    for(int k=1;k<n;k++){
		        if(arr1[k]-arr1[k-1]>=arr2[k]){
		            tot++;
		        }
		    }
		    System.out.println(tot);
		    
		    
		    
		}
	}
}
