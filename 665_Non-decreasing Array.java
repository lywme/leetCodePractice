package com.company;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception {
        int[] nums={3,4,2,6};


        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                count++;

                if(count>1)
                {
                    System.out.println("False");
                    return;
                }
                if(i-2<0||nums[i-2]<=nums[i])
                {
                    nums[i-1]=nums[i];
                }
                else if(nums[i-2]>nums[i])
                {
                    nums[i]=nums[i-1];
                }
            }

        }

        System.out.println("True");
    }
}
