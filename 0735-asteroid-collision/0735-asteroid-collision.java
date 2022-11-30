class Solution {
    public int[] asteroidCollision(int[] arr) {
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