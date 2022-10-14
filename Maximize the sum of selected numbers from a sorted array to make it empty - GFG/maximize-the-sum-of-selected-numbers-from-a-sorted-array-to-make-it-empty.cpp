//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 
  

// } Driver Code Ends
class Solution{
    public:
    int maximizeSum(int a[], int n) 
    {
        // Complete the function
        sort(a,a+n);

        map<int,int>m;

        for(int i=0;i<n;i++){

            m[a[i]]++;

        }

        int sum=0;

        for(int i=n-1;i>=0;i--){

            auto it=m.find(a[i]);

            if(it!=m.end() and  it->second>0){

                sum+=a[i];

                auto it_1=m.find(a[i]-1);

                if(it_1!=m.end() and it_1->second>0){

                    it_1->second--;

                }

                it->second--;

            }

        }

        return sum;
    }

};


//{ Driver Code Starts.



int main()
{
    
    int t;cin>> t;
    while(t--)
    {
        int n;
        cin >> n;
        int arr[n];
        
        for(int i=0;i<n;i++)
            cin>>arr[i];
        sort(arr, arr+n);
        Solution ob;
        
        cout << ob.maximizeSum(arr, n) << endl;
        
        
    }

}


// } Driver Code Ends