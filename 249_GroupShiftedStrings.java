import java.util.*;

public class scratch
{
    public static void main(String[] args)
    {
        String[] input=new String[]{"abc","bcd","acef","xyz","az","ba","a","z"};
        HashMap<Integer,HashSet<String>> result=groupStrings(input);
        result.forEach((k,v)->{
            System.out.print("Distance "+k+" : ");
            System.out.println(v);
        });
    }

    //这里github好像是需要返回 List<List<String>>，我不明白为什么要返回这个类型
    //我个人觉得返回HashMap<Integer,HashSet<String>> 更合理
    public static HashMap<Integer,HashSet<String>> groupStrings(String[] strings)
    {
        HashMap<Integer,HashSet<String>> resultMap=new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
            //System.out.println(strings[i]);
            //计算每个字符串的距离（第二个字符和第一个字符的差）
            //System.out.println(getDistance(strings[i]));

            //当前str的distance
            int distance=getDistance(strings[i]);
            if(resultMap.containsKey(distance))
            {
                resultMap.get(distance).add(strings[i]);
            }
            else
            {
                //如果没有key，则HashSet也需要初始化
                resultMap.put(distance,new HashSet<String>());
                resultMap.get(distance).add(strings[i]);
            }

        }
        return resultMap;
    }

    public static int getDistance(String input)
    {
        final int numOfAlphabet=26;
        for(int i=1;i<input.length();i++)
        {
            return (input.charAt(1)-input.charAt(0)+numOfAlphabet)%numOfAlphabet;
        }
        return 0;
    }
}

