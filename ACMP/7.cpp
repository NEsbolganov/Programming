#include<bits/stdc++.h>
using namespace std;
int main(){
    string a,b,c;
    cin>>a>>b>>c;
    cout<<max(a,max(b,c));
    return 0;
}