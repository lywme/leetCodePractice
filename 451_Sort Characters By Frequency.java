package com.company;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception {
        String input="tree";

        //统计字母出现的次数
        Map<Character,Integer> numberMap=new HashMap<>();
        for(int i=0;i<input.length();i++)
        {
            numberMap.put(input.charAt(i), numberMap.getOrDefault(input.charAt(i),0)+1);
        }

//        Set<Entry<Character,Integer>> entrySet=numberMap.entrySet();
//        for(Entry e:entrySet)
//        {
//            System.out.println(e.getKey()+" , "+e.getValue());
//        }

        //按照字母出现次数放入对应下标的List
        List<Character>[] bucket=new ArrayList[input.length()+1];
        for(Character key:numberMap.keySet())
        {
            int value=numberMap.get(key);
            if(bucket[value]==null)
            {
                bucket[value]=new ArrayList<Character>();
            }

            bucket[value].add(key);

        }

//        for(int i=bucket.length-1;i>0;i--)
//        {
//            if(bucket[i]!=null)
//            {
//                System.out.print(i+" times : ");
//                for(Character c:bucket[i])
//                {
//                    System.out.print(c+" , ");
//                }
//                System.out.println();
//            }
//        }

        StringBuilder builder=new StringBuilder();
        for(int i=bucket.length-1;i>0;i--)
        {
            if(bucket[i]!=null)
            {
                for(Character c:bucket[i])
                {
                    for(int j=0;j<i;j++)
                    {
                        builder.append(c);
                    }
                }

            }
        }

        System.out.println(builder.toString());

    }
}
