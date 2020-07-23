import java.util.*;

public class scratch
{
    public static void main(String[] args)
    {
        List<String> result=generatePossibleNextMoves("++++");
        System.out.println(result.toString());
    }

    public static List<String> generatePossibleNextMoves(String s)
    {
        if(s.length()<2)
            return null;

        List<String> result=new ArrayList<>();

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)=='+' && s.charAt(i)=='+')
            {
                result.add(s.substring(0,i-1)+"--"+s.substring(i+1,s.length()));
            }
        }

        return result;
    }
}

