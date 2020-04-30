package com.company;
import java.lang.reflect.Array;
import java.util.*;

/**
 *   观察者模式 Observer
 */

public class Test{
    public static void main(String[] args){
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums)
    {
        int point=1;
        int previous=nums[0];
        int count=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>previous)
            {
                nums[point]=nums[i];
                previous=nums[i];
                point++;
                count++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return count;
    }
}
