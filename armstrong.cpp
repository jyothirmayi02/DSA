#include <iostream>
#include <cmath>
using namespace std;
class Solution {
public:
    bool isArmstrong(int x) {
    int rem,a=0,temp=x;
     while (x!=0)
     {
        rem=x%10;
        a=a+pow(rem,3);
        x=x/10;
     }
     if (a==temp && temp>=0)
        return true;
     else
         return false;
}
};
int main()
{
   int n;
   cin>>n;
   Solution obj;
   int res = obj.isArmstrong(n);
   if (res==0)
     cout<<"It is not an Armstrong number";
   else
     cout<<"It is an Armstrong number";
}
