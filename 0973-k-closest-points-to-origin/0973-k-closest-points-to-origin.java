class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        int[][] ans = new int[k][2];
        for (int i = 0; i < points.length; i++){
            int t = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            q.add(new int[]{t, i});
        }
        for (int i = 0; i < k; i++){
            int idx = q.poll()[1];
            ans[i] = points[idx];
        }
        return ans;
    }
}