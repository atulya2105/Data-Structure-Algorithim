//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution{
public:
    vector<int>dp;

    void precompute(){
        
        dp.resize(1e6+1,1);
        
        for(int i = 2; i<=1e6; i++){
            
            if(dp[i])
            for(int  j = 2*i; j<=1e6; j += i){
                dp[j] = 0; 
            }
        }
        
    }
    
    void dfs(vector<vector<int>>&adj, vector<int>&vis, int node, int &cnt){
        cnt++;
        vis[node] = 1;
        for(auto it: adj[node]){
            if(!vis[it]){
                dfs(adj, vis, it, cnt);
            }
        }
    }
    int helpSanta(int n, int m, vector<vector<int>> &g){
        int ans = 0;
        vector<int>vis(n+1, 0);
        
        for(int i =1; i<=n; i++){
            int cnt =0;
            if(!vis[i]){
                dfs(g, vis, i, cnt);
                
            }
            ans = max(ans, cnt);
        }
        if(ans==1)return -1;
        int cnt = 0;
        for(int i = 2; i<=1e6; i++){
            if(dp[i])cnt++;
            if(cnt==ans)return i;
        }
        
        return -1;     
    }


};

//{ Driver Code Starts.

int main(){
	int t;cin>>t;
	Solution ob;
	ob.precompute();
	while(t--){
        int n,e,u,v;
        cin>>n>>e;
        vector<vector<int>> g(n+10);
        
		for(int i = 0; i < e; i++)
		{
			cin>>u>>v;
			g[u].push_back(v);
			g[v].push_back(u);
		}
		cout << ob.helpSanta(n, e, g) << endl;
		
	}
}



// } Driver Code Ends