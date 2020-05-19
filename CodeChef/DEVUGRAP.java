/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    long ans = 0;
		    long arr[] = new long[(int)n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int i=0 ;i<n;i++){
		        long r = arr[i] % k;
		        if(arr[i] >= k)
		            ans += Math.min(r, k-r);
		        else
		            ans += k-r;
		    }
		    
		    System.out.println(ans);
		    
		}
		
		
	}
}
