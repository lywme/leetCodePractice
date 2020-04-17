package com.company;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception {
        int[][] people=new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};

//        for(int i=0;i<people.length;i++)
//        {
//            System.out.print("[");
//            for(int j=0;j<people[i].length;j++)
//            {
//                System.out.print(people[i][j]+",");
//            }
//            System.out.println("]");
//        }

        Arrays.sort(people,(a,b)->(a[0]==b[0]?a[1]-b[1]:b[0]-a[0]));

        List<int[]> list=new ArrayList<>();

        for(int[] p:people)
        {
            list.add(p[1],p);
        }

        int[][] result=list.toArray(new int[list.size()][]);

//        for(int i=0;i<result.length;i++)
//        {
//            System.out.print("[");
//            for(int j=0;j<result[i].length;j++)
//            {
//                System.out.print(result[i][j]+",");
//            }
//            System.out.println("]");
//        }
    }
}
