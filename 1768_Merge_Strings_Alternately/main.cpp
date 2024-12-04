#include<iostream>
#include<string>
using namespace std;
string mergeAlternately(string word1, string word2){
    int n = word1.length();
        int m = word2.length();
        int flag = n < m ? 0 : 1;
        int cnt = 0;
        string result = "", temp = "";
        for(int i = 0; i < min(n, m); i++){
            result+=word1[i];
            result+=word2[i];
        }
        if(!flag) temp = word2.substr(n, m-n);
        else temp = word1.substr(m, n-m);
        result+=temp;
        return result;
}
int main()
{
    string word1, word2;
    cin>>word1>>word2;
    cout<<mergeAlternately(word1, word2);
    
}
