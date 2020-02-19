import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class scratch
{
    public static void main(String[] args)
    {
        String input="abca";
        char canDelete='c';
        System.out.println(validPalindrome(input,canDelete));
    }

    public static boolean validPalindrome(String input,char delete)
    {
        int point1=0;
        int point2=input.length()-1;
        while(point1<=point2)
        {
            if(input.charAt(point1)==input.charAt(point2))
            {
                point1++;
                point2--;
            }else if(input.charAt(point1)!=input.charAt(point2)&&(input.charAt(point1)==delete))
            {
                point1++;
            }
            else if(input.charAt(point1)!=input.charAt(point2)&&(input.charAt(point2)==delete))
            {
                point2--;
            }
            else if (input.charAt(point1)!=input.charAt(point2))
            {
                return false;
            }
        }
        return true;
    }
}
