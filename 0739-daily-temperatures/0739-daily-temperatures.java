class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = 0;
        st.push(n-1);
        for(int i = n-2;i>=0;i--){
            while(!st.empty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.empty()){
                ans[i] = 0;
            }else{
                ans[i] = st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}