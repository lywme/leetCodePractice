import java.util.*;

public class scratch
{
    public static void main(String[] args)
    {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String str)
    {
        //使用正则，把str字符串使用空白字符分隔成数组
        String[] strArr=str.split(" ");
        if(pattern.length()!=strArr.length)
        {
            //pattern和str长度不一致
            return false;
        }

        HashMap<Character,String> map=new HashMap<>();

        for(int i=0;i<pattern.length();i++)
        {
            //key存在
            if(map.containsKey(pattern.charAt(i)))
            {
                //key存在，则检查key和value的pair是否匹配,不匹配的话直接返回false
                if(!map.get(pattern.charAt(i)).equals(strArr[i]))
                {
                    return false;
                }
            }
            else //key不存在
            {
                //如果没有key，则value应该也不存在
                if(map.containsValue(strArr[i]))
                    return false;

                //key和value在map中不存在，则放入
                map.put(pattern.charAt(i), strArr[i]);
            }
        }

        //map.forEach((k,v)->System.out.println(k+" , "+v));
        return true;
    }
}

