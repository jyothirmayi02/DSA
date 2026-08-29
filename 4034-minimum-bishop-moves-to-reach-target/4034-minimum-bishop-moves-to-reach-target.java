class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int x = source[0] + source[1];
        int y = target[0] + target[1];
        if ((x % 2 == 0 && y % 2 != 0) ||(x % 2 != 0 && y % 2 == 0))
            return -1;
        int diff1 = Math.abs(source[0] - target[0]);
        int diff2 = Math.abs(source[1] - target[1]);
        if (diff1 == diff2)
            return 1;
        return 2;
    }
}