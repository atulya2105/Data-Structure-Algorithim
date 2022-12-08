class Solution {
public:
    int characterReplacement(string s, int k) {
        int i =0;
        int j = 0;
        int cnt = 0;
        int ans = 0;
        map<char,int> mp;
        while(j<s.length()){
            mp[s[j]]++;
            cnt = max(cnt,mp[s[j]]);
            if(j-i+1 - cnt > k){
                mp[s[i]]--;
                i++;
            }
            ans = max(ans,j-i+1);
            j++;
        }
        return ans;
    }
};