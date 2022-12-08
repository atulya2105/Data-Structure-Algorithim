class Solution {
    public int characterReplacement(String S, int k) {
       int[] frq = new int[26];
        int mxCnt = 0;
        int mxLen = 0;
        int j = 0;
        for(int i = 0;i<S.length();i++){
            frq[S.charAt(i)-'A']++;
            mxCnt = Math.max(mxCnt,frq[S.charAt(i)-'A']);
            if(i-j+1-mxCnt>k){
                frq[S.charAt(j)-'A']--;
                j++;
            }
            mxLen = Math.max(mxLen,i-j+1);
        }
        return mxLen;
    }
}