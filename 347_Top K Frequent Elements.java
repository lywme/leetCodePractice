package com.company;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception {
        int[] nums={1,1,1,2,2,3};
        int k=2;

        //统计不同数字出现的频率
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int n:nums)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

//        Set<Entry<Integer,Integer>> entrySet=hm.entrySet();
//        for(Entry<Integer,Integer> e:entrySet)
//        {
//            System.out.println(e.getKey()+", "+e.getValue());
//        }
        //桶，存放对应出现次数的[数字]
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(int key:hm.keySet())
        {
            int frequency=hm.get(key);
            if(bucket[frequency]==null)
                bucket[frequency]=new ArrayList<>();
            bucket[frequency].add(key);
        }

        //从出现数字最多的次数，遍历到出现最低
//        for(int i=nums.length;i>=1;i--)
//        {
//            if(bucket[i]!=null)
//            {
//                System.out.print(i+" times :");
//                for (int item : bucket[i]) {
//                    System.out.print(item + ", ");
//                }
//                System.out.println();
//            }
//        }

        //从出现数字最多的次数，遍历到出现最低
        List<Integer> resultList=new ArrayList<>();

        for(int i=nums.length;i>=1;i--)
        {
            if (bucket[i] != null) {
                for (int item : bucket[i]) {
                    if (resultList.size() < k)
                        resultList.add(item);
                    else {
                        System.out.println(Arrays.toString(resultList.toArray()));
                        return;
                    }
                }
            }
        }
    }
}
