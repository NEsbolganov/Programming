#include<bits/stdc++.h>
using namespace std;
int main(){
    string s;
    getline(cin,s);
    int num=0,num1;
    for(int i=s.length()-1;i>=0;i--){
        if(s[i]=='!')num+=1;
        if(s[i]==' '){
            num1=stoi(s.substr(0,i));
        }
    }
    // cout<<num1<<endl;
    int res=num1;
    while(num1>0){
        if(num1-num<=0){
            cout<<res;
            return 0;
        }
        res*=num1-num;
        num1-=num;
    }
    cout<<res;
    return 0;
}