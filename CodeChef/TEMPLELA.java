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
		    if(n%2==0 || arr[0]!= 1 || arr[n-1]!=1){
		        System.out.println("no");
		    }
		    else{
		        int mid=n/2;
		        int first=0,second=0;
		        for(int k=0;k<mid;k++){
		            if(arr[k+1]-arr[k]!=1){
		                first++;
		            }
		        }
		        for(int h=mid;h<n-1;h++){
		            if(arr[h]-arr[h+1]!=1){
		                second++;
		            }
		        }
		        if(first==0 && second==0){
		            System.out.println("yes");
		        }
		        else{
		            System.out.println("no");
		        }
		    }
		    
		    
		}
	}
}
