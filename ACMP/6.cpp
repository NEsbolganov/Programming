#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin>>s;
    if(s.length()!=5){
        cout<<"ERROR";
        return 0;
    }
    // cout<<int(s[0]);
    if(s[2]!='-'){
        cout<<"ERROR";
        return 0;
    }
    // cout<<'b'-'a'<<" "<<'7'-'4';
    if((int(s[0])<=64 or int(s[0])>=73) and (int(s[3])<=64 or int(s[3])>=73)){
        cout<<"ERROR";
        return 0;
    }
    if((int(s[1])<=48 or int(s[1])>=57) and (int(s[4])<=48 or int(s[4])>=57)){
        cout<<"ERROR";
        return 0;
    }
    if(abs((s[3]-s[0])==1 and abs(s[4]-s[1])==2) or (abs(s[3]-s[0])==2 and abs(s[4]-s[1])==1))cout<<"YES";
    else cout<<"NO";
    return 0;
}