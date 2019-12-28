/*
Given an array C[], write a program that prints 1 if array is sorted in non-decreasing order, else prints 0.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case there will be two lines. First line contains the size of the array N. Second line contains N space seperated integers of the array C[i].

Output:
Print 1 if array is sorted, else print 0.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 500
1 ≤ C[i] ≤ 1200

Example:
Input
2
5
10 20 30 40 50
6
90 80 100 70 40 30

Output
1
0

*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int flag=0;
		    int[] arr=new int[a];
		    for(int j=0;j<a;j++){
		        arr[j]=sc.nextInt();
		    }
		    for(int k=0;k<a-1;k++){
		        if(arr[k]>arr[k+1]){
		            flag++;
		            break;
		      }
		    }
		    if(flag==0)
		        System.out.println("1");
		    else
		        System.out.println("0");
		}
	}
}
