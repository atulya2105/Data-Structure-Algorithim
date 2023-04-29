//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            long n=Long.parseLong(in.readLine());
            Solution ob=new Solution();
            out.println(ob.findNumber(n));
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long findNumber(long N)
    {
        long ans=0;
        if(N<=5)
        {
            if(N==1)
            {return 1;}
             if(N==2)
            {return 3;}
             if(N==3)
            {return 5;}
             if(N==4)
            {return 7;}
             if(N==5) 
            {return 9;}
        }
        if(N%5==0) return findNumber(N/5-1)*10 +9;
        else return findNumber(N%5)+findNumber(N/5)*10;
    }
}