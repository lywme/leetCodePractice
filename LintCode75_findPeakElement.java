package com.company;
import java.lang.reflect.Array;
import java.util.*;


public class Test{
    public static void main(String[] args){
        int[] nums={1, 2, 1, 3, 4, 5, 7, 6};
        System.out.println(findPeak(nums));
    }

    public static int findPeak(int[] A)
    {
        int start=0;
        int end=A.length-1;

        while(start+1<end)
        {
            int mid=(start+end)/2;
            if(A[mid]>A[mid-1]&&A[mid]>A[mid]+1)
                return mid;
            else if(A[mid]<A[mid-1])
            {
                end=mid;
            }
            else if(A[mid]>A[mid-1])
            {
                start=mid;
            }
            else if(A[mid]<A[mid-1]&&A[mid]>A[mid]+1)
            {
                start=mid;
            }
        }

        return A[start]>A[end]?start:end;
    }
}
