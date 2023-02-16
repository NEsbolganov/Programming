#include<bits/stdc++.h>
using namespace std;
double Area(double a,double b,double c){
    double p = (a+b+c)/2;
    double S = sqrt(p*(p-a)*(p-b)*(p-c));
    // cout<<S<<" ";
    return S;
}
int main(){
    int n,cnt=0;
    cin>>n;
    for(int i=0;i<n;i++){
    double x1,x2,x3,y1,y2,y3,x4,y4,x,y;
    cin>>x>>y>>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;
    double first = sqrt(pow((x-x1),2)+pow((y-y1),2));
    double second = sqrt(pow((x2-x),2)+pow((y2-y),2));
    double third = sqrt(pow((x3-x),2)+pow((y3-y),2));
    double fourth = sqrt(pow((x4-x),2)+pow((y4-y),2));
    double a = sqrt(pow((x2-x1),2)+pow((y2-y1),2));
    double b = sqrt(pow((x3-x2),2)+pow((y3-y2),2));
    // cout<<"A="<<a<<" B="<<b<<"\n";
    double S = Area(a,second,first)+Area(b,third,second)+Area(a,fourth,third)+Area(first,b,fourth);
    double S2=a*b;
    // cout<<"\nS="<<S<<" a*b="<<a*b<<" "<<S-S2;
    if(abs(S)==abs(S2))cnt++;
    }
    cout<<cnt;
    // cout<<Area(first,second,third);
    return 0;
}