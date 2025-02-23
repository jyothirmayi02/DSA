#include <iostream>
#include <cmath>
using namespace std;
class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0)
           return false;
        if (x<10 || x==0)
           return true;
        int n = floor(log10(x))+1;
        for (int i=0;i<n/2;i++)
        {
            int m = (x/(int)pow(10,n-1-i))%10;
            int l = (x/(int)pow(10,i))%10;
            if (l!=m)
               return false;
        }
        return true;
    }
};
int main(){
  int n;
  cin>>n;
  Solution ob;
  int result = ob.isPalindrome(n);
  if (result==0)
    cout<<"It is not a Palindrome";
  else
    cout<<"It is a Palindrome";
  return 0;
}
