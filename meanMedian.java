// { Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
//User function Template for C++

int median(int A[],int N)
{
    int med;
    sort(A,A+N);
    int n=N;
    if(n%2==0){
        int a=n/2;
        int b=a-1;
        int med=(A[a] + A[b])/2;
        
        return med;
    }
    else{
        int m=n/2;
        int med = A[m];
        return med;
    }
    
    //your code here
    //If median is in fraction then convert it to integer and return
}

int mean(int A[],int N)
{   int sum=0;
    for(int i=0;i<N;i++){
        sum+=A[i];
    }
    int mean = sum/N;
    return mean;
}
