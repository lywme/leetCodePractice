public class scratch
{
    public static void main(String[] args)
    {
        sqrtOf2Sum(10);
    }

    public static void sqrtOf2Sum(int target)
    {
        int point1,point2;
        point1=1;
        point2=(int) Math.ceil(Math.sqrt(target));
        while (point1<point2)
        {
            if(point1*point1+point2*point2==target)
            {
                System.out.println(point1+"^2 + "+point2+"^2 = "+target);
                return;
            }
            else if(point1*point1+point2*point2>target)
            {
                point2--;
            }
            else if(point1*point1+point2*point2<target)
            {
                point1++;
            }
        }
        System.out.println("Does not exist a solution.");
    }
}
