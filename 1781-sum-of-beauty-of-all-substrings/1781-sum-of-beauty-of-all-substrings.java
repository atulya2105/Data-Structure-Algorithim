class Solution {
    int getMax(int[] arr){
        int n = arr.length;
        int mx = 0;
        for(int i = 0;i<n;i++){
            mx = Math.max(mx,arr[i]);
        }
        return mx;
    }
    int getMin(int[] arr){
        int n= arr.length;
        int mn = Integer.MAX_VALUE;
        for(int i: arr){
            if(i!=0)
               mn = Math.min(mn,i);
        }
        return mn;
    }
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j = i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int beuty = getMax(freq)-getMin(freq);
                sum += beuty;
            }
            
        }
        return sum;
    }
}