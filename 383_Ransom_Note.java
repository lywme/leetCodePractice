package com.company;
import java.lang.reflect.Array;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));

    }




    public static boolean canConstruct(String ransomNote, String magazine)
    {
        //put all the char from magazine into map
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }

        //map.forEach((k,v)->System.out.println(k+" , "+v));

        //go through each Char in ransomNote
        for(int i=0;i<ransomNote.length();i++)
        {
            if(map.containsKey(ransomNote.charAt(i))&&map.get(ransomNote.charAt(i))>=1)
            {
                map.replace(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
