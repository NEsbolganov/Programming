#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int>v;
    for(int i=0;i<n;i++){
        int f;
        cin>>f;
        v.push_back(f);
    }
    if(n==1){
        cout<<0;
        return 0;
    }
    int result=0;
    bool check = true;
    for(int i=0;i<n-2;i++){
        int first = abs(abs(v.at(i)-v.at(i+1)));
        int second = abs(v.at(i)-v.at(i+2))*3;
        // cout<<"Second="<<second<<endl;
        if(second<first){
            result+=second;
            if(i==n-3)check=false;
            i++;
        }else result+=first;
    }
    if(check)result+=abs(v.at(n-1)-v.at(n-2));
    cout<<result;
    return 0;
}
//https://acmp.ru/index.asp?main=task&id_task=29