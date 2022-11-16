//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            int[] fre = new int[26];
            for(int j = i;j<s.length();j++){
                
                fre[s.charAt(j)-'a']++;
                ans += findBeauty(fre);
            }
        }
        return ans;
    }
    static int findBeauty(int[] fre){
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for( int it : fre){
            if(it==0) continue;
            mx = Math.max(mx,it);
            mn = Math.min(mn,it);
        }
        return mx-mn;
    }
}
        
