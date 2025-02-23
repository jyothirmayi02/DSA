#include <iostream>
#include <cmath>
using namespace std;
class Solution {
public:
    bool isPalindrome(int x) {
    x=(long)x;
    long rem,rev=0,temp=x;
     while (x!=0)
     {
        rem=x%10;
        rev=rev*10+rem;
        x=x/10;
     }
     if (rev==temp && temp>=0)
        return true;
     else
         return false;
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
