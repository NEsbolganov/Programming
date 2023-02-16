#include<bits/stdc++.h>
using namespace std;
int main(){
    string a,b;
    cin>>a>>b;
    int cnt=0;
    for(int i=0;i<a.length()-b.length()+1;i++){
        string c = a.substr(i,b.length());
        sort(c.begin(),c.end());
        do{
        if(c==b)cnt++;
        // cout<<c<<" ";
        }while(next_permutation(c.begin(),c.end()));
        cout<<endl;
    }
    cout<<cnt;
    return 0;
}