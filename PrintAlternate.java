/*
You are given an array A of size N. You need to print elements of A in alternate order.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each test case contains two lines of input. The first line contains N and the second line contains the elements of the array.

Output Format:
For each testcase, print the alternate elements of the array(starting from index 0).

Your Task:
Since this is a function problem, you just need to complete the provided function void print(int ar[],int n)

Constraints:
1 <= T <= 200
1 <= N <= 105
1 <= Ai <= 105

Example:
Input:
2
4
1 2 3 4
5
1 2 3 4 5
Output:
1 3
1 3 5

Explanation:
Testcase1: print 1, then 3.
Testcase2: print 1, then 3, then 5.

*/


{
//Initial Template for Java
import java.util.*;
class Alternate
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
             GfG gfg = new GfG();
             gfg.print(arr, n);
             System.out.println();
             
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
// arr[] is the array 
// n is the number of elements in array.
class GfG
{
    public static void print(int arr[], int n)
    {
        for(int i=0;i<n;i=i+2){
            System.out.printf("%d ",arr[i]);
        }
        
        
    }
}
