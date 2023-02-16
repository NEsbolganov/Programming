#include<bits/stdc++.h>
using namespace std;
int main(){
    string a,b;
    cin>>a>>b;
    int bulls=0,cows=0;
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(a[i]==b[j] and i==j)bulls++;
            if(a[i]==b[j] and i!=j)cows++;
        }
    }
    cout<<bulls<<" "<<cows;
    return 0;
}