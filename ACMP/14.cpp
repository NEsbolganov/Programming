#include<bits/stdc++.h>
using namespace std;
int main(){
    int a,b;
    cin>>a>>b;
    int c = a*b;
    while(a>0 and b>0){
        if(a>b){
            a=a%b;
        }else b = b%a;
    }
    cout<<c/(a+b);
    return 0;
}