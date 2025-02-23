Class Solution{
public:
     int lcm(int a, int b) {
        int max_num = max(a, b);
        for (int i = max_num; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0)
                return i;
        }
    }
    int gcd(int a, int b) {
        int min_num = min(a, b);
        for (int i = min_num; i >= 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
    }
    vector<int> lcmAndGcd(int a, int b) {
        int l = lcm(a,b);
        int g = gcd(a,b);
        return {l,g};
    }
};
