/*
Given a binary array A[] of size N. The task is to arrange array in increasing order.

Note: The binary array contains only 0  and 1.

Input:
The first line of input contains an integer T, denoting the testcases. Every test case contains two lines, first line is N(size of array) and second line is space separated elements of array.

Output:
Space separated elements of sorted arrays. There should be a new line between output of every test case.

Constraints:
1 < = T <= 100
1 <= N <= 106
0 <= A[i] <= 1

Example:
Input:
2
5
1 0 1 1 0
10
1 0 1 1 1 1 1 0 0 0

Output:
0 0 1 1 1
0 0 0 0 1 1 1 1 1 1



*/


#include <iostream>
using namespace std;
void inputarr(int arr[],int n)
{
    for(int i=0;i<n;i++)
    cin>>arr[i];
}
void printarr(int arr[],int n)
{
    for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
    cout<<endl;
}
void sortarray(int arr[],int n)
{
    int i=0,j=n-1;
    while(i<j)
    {
        while(arr[i]!=1)
        i++;
        while(arr[j]!=0)
        j--;
        if(i<j)
        {
        swap(arr[i],arr[j]);
        // printarr(arr,n);
        i++;
        j--;
        }
        else
        break;
    }
}

int main() {
	//code
	int tc;
	cin>>tc;
	while(tc--)
	{
	    int n;
	    cin>>n;
	    int arr[n];
	    inputarr(arr,n);
	    sortarray(arr,n);
	    printarr(arr,n);
	}
	return 0;
}
