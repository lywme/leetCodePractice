package com.company;
import java.lang.reflect.Array;
import java.util.*;


public class Test{
    public static void main(String[] args){
        int[] nums={4,5,6,7,8,9,1,2,3};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        int target=nums[end];

        while(start+1<end)
        {
            int mid=(start+end)/2;
            if(nums[mid]>target)
            {
                //go to right
                start=mid;
            }
            else if(nums[mid]<target)
            {
                //go to left
                end=mid;
            }
        }

        return Math.min(nums[start],nums[end]);
    }
}
