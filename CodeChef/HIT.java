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
		int p=0;
		while(t-->0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    if(arr[n/4-1]==arr[n/4]){p++;}
            if(arr[n/2-1]==arr[n/2]){p++;}
            if(arr[3*n/4-1]==arr[3*n/4]){p++;}

            if(p>0){
                System.out.println("-1");
            }
            else{
                    System.out.println(arr[n/4]+" "+arr[n/2]+" "+arr[3*n/4]);
            }
                p=0;
		}
	}
}
