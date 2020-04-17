package com.company;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        int presum=nums[0];
        int max=presum;

        for(int i=1;i<nums.length;i++)
        {
            presum=presum>0?presum+nums[i]:nums[i];
            max=Math.max(max,presum);
        }

        System.out.println(max);
    }
}
