#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
char findTheDifference(string s, string t) {
    sort(s.begin(), s.end());
    sort(t.begin(), t.end());
    for(int i = 0; i < t.length(); i++){
        if(s[i] != t[i]){
            return t[i];
        }
    }
    return t[t.length()-1];
}

int main(){
    string s, t;
    cin>>s>>t;
    cout<<findTheDifference(s,t);
}
