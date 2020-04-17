package com.company;
import java.util.*;
import java.util.Map.Entry;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception {
        int[] prices={7,1,5,3,6,4};

        if(prices.length==0)
            return;


        int maxReward=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
                maxReward+=prices[i]-prices[i-1];
        }

        System.out.println(maxReward);
    }
}
