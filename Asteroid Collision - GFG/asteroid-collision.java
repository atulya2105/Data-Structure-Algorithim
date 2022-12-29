//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] arr) {
        // code here
        if(arr.length<1) return arr;
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<arr.length;i++){
           if(arr[i]>0){
               st.push(arr[i]);
           }else{
               while(!st.empty() && (st.peek()>0 && Math.abs(arr[i]) > st.peek())){
                   st.pop();
               }
                if(st.empty() ||st.peek()<0){
                   st.push(arr[i]);
               }else if(st.peek() + arr[i]== 0)
                   st.pop();
              
           }
           
        }
        return st.stream().mapToInt(i->i).toArray();
    }
}
