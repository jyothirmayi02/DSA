#include <iostream>
using namespace std;
class Solution{
public:
    // Function to count the number of digits in n that evenly divide n
    int evenlyDivides(int n) {
        int temp = n,count=0;
        if (n==0) // if number is 0 then it returns 1
          return 1;
        while(n!=0) // Loop to get each digit of a number
        {
          int rem = n%10; // Get the last digit
          if (rem!=0 && temp%rem==0) // Skip if the rem is zero
              count++; // count increases when the rem divides the number evenly
          n=n/10; // Remove the last digit
        }
        return count;
    }
};
int main(){
    int N;
    cin>>N;
    Solution ob;
    cout<<ob.evenlyDivides(N)<<endl;
    return 0;
}
