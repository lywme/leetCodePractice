package com.company;
import java.lang.reflect.Array;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar1(String s)
    {
        //put all the char into map
        Map<Character,List<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.putIfAbsent(s.charAt(i),new ArrayList<>());
            map.get(s.charAt(i)).add(i);
        }

        //map.forEach((k,v)->System.out.println(k+" , "+v));

        //verify to find the first unique
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i)).size()==1)
                return i;
        }

        return -1;
    }


    public static int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        //map.forEach((k,v)->System.out.println(k+" , "+v));

        //verify to find the first unique
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
                return i;
        }

        return -1;
    }
}
