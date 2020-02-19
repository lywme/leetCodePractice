import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class scratch
{
    public static void main(String[] args)
    {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String input)
    {
        Collection<Character> vowel=new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int point1,point2;
        point1=0;
        point2=input.length()-1;
        char[] tempArr=new char[input.length()];
        while(point1<=point2)
        {
            char p1=input.charAt(point1);
            char p2=input.charAt(point2);
            if(!vowel.contains(p1))
            {
                tempArr[point1++]=p1;
            }
            else if(!vowel.contains(p2))
            {
                tempArr[point2--]=p2;
            }
            else
            {
                tempArr[point1++]=p2;
                tempArr[point2--]=p1;
            }
        }
        return new String(tempArr);
    }
}
