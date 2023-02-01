class Solution {
    int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        
        int i = 0;
        int j = str2.length();
        int n = str1.length();
        String ans = "";
        if(!(str1+str2).equals(str2+str1))
            return ans;
        return str1.substring(0,gcd(j,n));
       // return ans;
    }
}