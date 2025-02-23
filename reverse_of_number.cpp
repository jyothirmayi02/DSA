#include <iostream>
#include <climits>
using namespace std;
class Solution {
public:
    int reverse(int x) {
       int rem,rev=0;
       while(x!=0)
       {
         rem = x%10;
         if (rev > INT_MAX/10 || (rev == INT_MAX/10 && rem>7))
           return 0; //If overflow occurs
         if ((rev < INT_MIN/10) || (rev == INT_MIN/10 && rem<-8))
           return 0; //If underflow occurs
         rev = (rev*10) + rem;
         x = x/10;
       }
       return rev;
    }
};
int main()
{
   int n;
   cin>>n;
   Solution obj;
   cout<<obj.reverse(n);
}

