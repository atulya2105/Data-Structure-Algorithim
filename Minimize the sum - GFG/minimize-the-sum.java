//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long sum = 0;
        for(int i = 0;i<N;i++){
            pq.offer((long)arr[i]);
        }
        int size = pq.size();
        for(int i = 0;i<size-1;i++){
            long a = pq.poll();
            long b = pq.poll();
            sum += a+b;
            pq.offer(a+b);
        }
        // return sum
        // while(!pq.isEmpty()){
        //     System.out.print(pq.poll()+" ");
        // }
        return sum;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends