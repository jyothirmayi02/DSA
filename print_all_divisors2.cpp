class Solution {
  public:
    int sumOfDivisors(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=sqrt(n);j++)
             if (i%j == 0)
              sum=sum+j;
              if (j != i/j)
                sum=sum+j;
        }
        return sum;
    }
};
