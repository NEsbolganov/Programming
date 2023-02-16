#include <bits/stdc++.h>
using namespace std;
bool IsPalindrom (string s){
    string a, b;
    a = s.substr(0,s.length()/2);
    for(int i = 0; i < a.length(); i++){
        b+=s[s.length()-1-i];
    }
    return a==b;
}
string func(string s){
    if(s.length()==1){
        return "";
    }
    if(IsPalindrom(s) == true){
        s.erase(s.end()-1);
        return func(s);
    }
    return s;
}
int main(){
    string s;
    cin >> s;
    if(func(s) == ""){
        cout << "NO SOLUTION";
    }
    cout << func(s);
    return 0;
}//https://acmp.ru/index.asp?main=task&id_task=491