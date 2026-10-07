class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length, mid = 0, ans = -1;
        if (h < n) return -1;
        int larg = 0, small = 1;
        for (int i = 0; i < n; i++){
            if (piles[i] > larg) larg = piles[i];
            //if (piles[i] < small) small = piles[i];
        }
        System.out.println(larg+" "+small);
        if (h == n) return larg;
        while (small <= larg){
            mid = small + (larg - small)/2;
            int x = 0;
            for (int i = 0; i < n; i++) x += Math.ceil((double)piles[i]/mid);
            if (x <= h){
                ans = mid;
                larg = mid-1;
            }
            else small = mid+1;
            System.out.print(x+" ");
        }
        return ans;
    }
}