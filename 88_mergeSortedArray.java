import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class scratch
{
    public static void main(String[] args)
    {
        int[] nums1 =new int[]{1,2,3,0,0,0};
        int[] nums2 =new int[]{2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1=m-1;
        int point2=n-1;
        int global=m+n;
        while(point1>=0&&point2>=0)
        {
            if(nums1[point1]>=nums2[point2])
            {
                nums1[--global]=nums1[point1];

                point1--;
            }
            else if(nums1[point1]<=nums2[point2])
            {
                nums1[--global]=nums2[point2];

                point2--;
            }
        }

        while(point2>=0)
        {
            nums1[--global]=nums2[point2--];
        }
    }
}
