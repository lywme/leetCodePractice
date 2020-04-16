package com.company;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception {
        int[][] intervals=new int[4][];
        intervals[0]=new int[]{0,1};
        intervals[1]=new int[]{1,2};
        intervals[2]=new int[]{2,3};
        intervals[3]=new int[]{1,3};


        if(intervals.length==0)
            return;

        for(int i=0;i<intervals.length;i++)
        {
            for(int j=0;j<intervals[i].length;j++)
            {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }

        // 按照结束时间，从小到大排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        for(int i=0;i<intervals.length;i++)
        {
            for(int j=0;j<intervals[i].length;j++)
            {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }

        //count保存的是 不冲突的interval数量
        int count=1;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<end)
            {
                continue;
            }
            end=intervals[i][1];
            count++;
        }

        System.out.println(intervals.length-count);
    }
}
