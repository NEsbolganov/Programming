#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    string s="";
    for(int i=2;i<10;i++){
        if(n<=0)return 0;
        while(n%i==0){
            if(n%i==0)s+=char(48+i);
            n/=i;
        }
    }
    // cout<<(s[2]-'0')*2;
    for(int i=0;i<s.length();i++){
        int cnt=0;
        for(int j=0;j<s.length();j++){
            if(s[i]==s[i] and i!=j)cnt++;
        }
        if(cnt>0){
            int a=pow(s[i]-'0',cnt+1);
            if(a<10)s+=char(48+a);
        }
    }
    cout<<s;
    return 0;
}