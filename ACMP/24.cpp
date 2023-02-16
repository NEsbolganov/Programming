#include<bits/stdc++.h>
using namespace std;
bool check(string s){
    int len = 0;
    for(int i=0;i<s.length();i++){
        if(s[i]!=s[i+1])break;
        len++;
    }
    int current=0;
    for(int i=0;i<s.length()-1;i++){
        if(s[i]!=s[i+1])current++;
        if(s[i]==s[i+1]){
            if(current!=len)return false;
            current=0;
        }
    }
    return true;
}
int main(){
    int m,n;
    cin>>n>>m;
    string s="";
    set<string>ans;
    for(int i=0;i<m;i++){
        s+='T';
    }
    for(int i=0;i<n-m;i++)s+='.';
    // cout<<s;
    sort(s.begin(),s.end());
    do{
        // cout<<s<<"\n";
        if(check(s)){
            cout<<s<<"\n";
            ans.insert(s);
        }
    }while(next_permutation(s.begin(),s.end()));
    cout<<ans.size();
    return 0;
}