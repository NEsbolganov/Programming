#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,res=0;
    cin>>n;
    if(n>0)for(int i=1;i<=n;i++)res+=i;
    if(n<=0)for(int i=1;i>=n;i--)res+=i;
    cout<<res;
    return 0;
}