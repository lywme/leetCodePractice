import java.util.*;

public class scratch
{
    public static void main(String[] args)
    {
        String s1="ab",s2="aa";
        System.out.println(isIsomorphic(s1,s2));
    }

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character si=s.charAt(i);
            Character ti=t.charAt(i);
            if(map.containsKey(si))
            {
                //如果已经有key,看看key对应的value是否不等于新的ti
                if(map.get(si)!=ti)
                    return false;
            }
            else
            {
                //如果不存在这个key,查看ti是否在value中存在
                if(map.containsValue(ti)) return false;
                map.put(si,ti);
            }
        }
        return true;
    }
}

