#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin>>s;
    int cnt=0;
    if(s.length()<5){
        cout<<"0";
        return 0;
    }
    for(int i=0;i<s.length()-4;i++){
        if(s.substr(i,5)==">>-->" or s.substr(i,5)=="<--<<")cnt++;
        // cout<<s.substr(i,5)<<" ";
    }
    cout<<cnt;
    return 0;
}//https://acmp.ru/index.asp?main=task&id_task=44