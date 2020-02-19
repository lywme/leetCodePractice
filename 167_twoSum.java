public class scratch
{
    public static void main(String[] args)
    {
        int[] numbers={2, 7, 11, 15};
        twoSum(numbers,26);
    }

    public static void twoSum(int[] array,int target)
    {
        if(array.length>1)
        {
            int point1, point2;
            point1 = 0;
            point2 = array.length - 1;
            while(point1<point2)
            {
                if((array[point1]+array[point2])==target)
                {
                    System.out.println(array[point1] + " + " + array[point2] + " = " + target);
                    return;
                }
                else if((array[point1]+array[point2])>target)
                {
                    point2--;
                }
                else if((array[point1]+array[point2])<target)
                {
                    point1++;
                }
            }
            System.out.println("Does not exist two items which sum is target.");
        }
        else
        {
            System.out.println("The size of given array is too small.");
        }
    }
}
