class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> closest = new PriorityQueue<>((a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
        for (int i = 0; i < points.length; i++) {
            closest.offer(points[i]);
            while (closest.size() > k) closest.poll();
        }
        return closest.toArray(new int[0][]);
    }
}
