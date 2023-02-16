#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int a[n],sum1=0;
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]>0)sum1+=a[i];
    }
    int min=1e9,max=-1e9,indMin,indMax;
    for(int i=0;i<n;i++){
        if(min>a[i]){
            min=a[i];
            indMin=i;
        }
        if(max<a[i]){
            max=a[i];
            indMax=i;
        }
    }
    int sum2=1;
    if(indMax>indMin)for(int i=indMin+1;i<indMax;i++)sum2*=a[i];
    else if(indMin>indMax)for(int i=indMax+1;i<indMin;i++)sum2*=a[i];
    cout<<sum1<<" "<<sum2;
    return 0;
}