#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int cnt=0;
    for(int i=0;i<n;i++){
        if(a[i]%2==1){
            cnt++;
            cout<<a[i]<<" ";
        }
    }
    cout<<endl;
    for(int i=0;i<n;i++){
        if(a[i]%2==0){
            cout<<a[i]<<" ";
        }
    }
    cout<<endl;
    if(cnt>n-cnt)cout<<"NO";
    else cout<<"YES";
    return 0;
}