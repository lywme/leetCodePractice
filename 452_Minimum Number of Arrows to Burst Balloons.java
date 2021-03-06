class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
        
        // 按照结束坐标，从小到大排序
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        
        int count=1;
        int end=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]<=end)
                continue;
            count++;
            end=points[i][1];
        }
        
        return count;
    }
}
