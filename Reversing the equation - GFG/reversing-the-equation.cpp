//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
  public:
    string reverseEqn (string s)
        {
            //code here.
             string ans="",t="";
            for(int i=s.size()-1;i>=0;i--){
                if(s[i]<'0' || s[i]>'9'){      //If s[i] is operator
                    reverse(t.begin(),t.end());
                    ans+=t;
                    ans+=s[i];
                    t="";
                }
                else t+=s[i];
            }
             reverse(t.begin(),t.end());
             ans+=t;
            return ans;
        }
};

//{ Driver Code Starts.
int main()
{
    int t; cin >> t;
    while (t--)
    {
        string s; cin >> s;
        Solution ob;
        cout <<ob.reverseEqn (s) << endl;
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends