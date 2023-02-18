//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        int j = 0;
        int cnt = 0;
        for(int i = 0;i<n;i++){
            
            if(arr.charAt(i)=='O'){
                m--;
            }
            while(m<0 && j<i){
                if(arr.charAt(j)=='O'){
                    m++;
                }
                j++;
            }
            cnt = Math.max(cnt,(i-j+1));
        }
        return cnt;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends