//https://acmp.ru/index.asp?main=task&id_task=34
#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,k;
    cin>>n>>k;
    string s;
    cin>>s;
    multiset<string>st;
    multiset<string>::iterator it;
    if(s.length()!=n){
        cout<<"NO";
        return 0;
    }
    for(int i=0;i<s.length()-k;i++){
        string s1=s.substr(i,k);
        st.insert(s1);
    }
    for(it=st.begin();it!=st.end();++it){
        if(st.count(*it)>1){
            cout<<"YES";
            return 0;
        }
    }
    cout<<"NO";
    return 0;
}