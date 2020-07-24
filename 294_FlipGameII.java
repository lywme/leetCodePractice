import java.util.*;

public class scratch
{
    public static void main(String[] args)
    {
        System.out.println(canWin("+--++"));
    }

    public static boolean canWin(String s)
    {
        if(s==null || s.length()<2)
        {
            return false;
        }


        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)=='+' && s.charAt(i)=='+')
            {
                String sol=s.substring(0,i-1)+"--"+s.substring(i+1);
                if(!canWin(sol))
                {
                    return true;
                }
            }
        }

        return false;
    }
}

