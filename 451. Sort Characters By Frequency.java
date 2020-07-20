import java.util.*;

public class scratch
{
    public static void main(String[] args)
    {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        //保存key和对应的 计数
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        //map.forEach((k,v)->System.out.println(k+" , "+v));

        //从value计数
        List<Character>[] list=new ArrayList[s.length()+1];
        for(Character key:map.keySet())
        {
            Integer value=map.get(key);
            if(list[value]==null)
            {
                list[value]=new ArrayList<Character>();
            }
            list[value].add(key);
        }

//        for(int i=0;i<list.length;i++)
//        {
//            System.out.println(list[i]);
//        }
        StringBuilder sb=new StringBuilder();
        for(int i=list.length-1;i>=0;i--)
        {
            if(list[i]!=null)
            {
                for(Character eachC:list[i])
                {
                    for(int j=i;j>0;j--)
                    {
                        sb.append(eachC);
                    }
                }
            }
        }

        return sb.toString();
    }
}

