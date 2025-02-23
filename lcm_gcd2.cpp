Class Solution{
public:
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    int lcm(int a, int b) {
        return abs(a * b) / gcd(a, b);
    }
    vector<int> lcmAndGcd(int a, int b) {
        int l = lcm(a,b);
        int g = gcd(a,b);
         return {l,g};
    }
};
