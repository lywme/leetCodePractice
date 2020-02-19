import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class scratch
{
    public static void main(String[] args)
    {
        String input="aba";

        System.out.println(validPalindrome(input));
    }

    public static boolean validPalindrome(String input)
    {
        int point1=0;
        int point2=input.length()-1;
        while(point1<=point2)
        {
            if(input.charAt(point1)==input.charAt(point2))
            {
                point1++;
                point2--;
            }
            else if (input.charAt(point1)!=input.charAt(point2))
            {
                return validPalindromeHelper(input,point1,point2-1)||validPalindromeHelper(input,point1+1,point2);
            }
        }
        return true;
    }

    public static boolean validPalindromeHelper(String input,int start,int end)
    {
        while(start<=end)
        {
            if(input.charAt(start)==input.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
