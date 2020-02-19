import java.util.*;

public class scratch
{
    public static void main(String[] args)
    {

        String s="";
        List d=new LinkedList();
        d.add("b");
        d.add("a");

        System.out.println(findLongestWord(s,d));
    }

    public static String findLongestWord(String s, List<String> d) {
        String longestWord="";
        //traverse the entire List
        Iterator it=d.iterator();
        while(it.hasNext())
        {
            String item=(String)it.next();
            if(s.length()==0)
                break;
            //traverse every letter in item
            int i;
            int lastFoundIndex=0;
            for(i=0;i<item.length()-1;i++)
            {
                lastFoundIndex=s.indexOf(item.charAt(i),lastFoundIndex);
                if(lastFoundIndex==-1)
                    break;
                if(lastFoundIndex<=s.indexOf(item.charAt(i+1),lastFoundIndex))
                {

                }
                else
                {
                    break;
                }
            }

            if(i==item.length()-1)
            {
                if(item.length()>longestWord.length())
                    longestWord = new String(item);
                else if(item.length()==longestWord.length())
                {
                    //determine who has the smallest lexicographical order.
                    //Returns:
                    //a negative integer, zero, or a positive integer as the specified String is greater than,
                    // equal to, or less than this String, ignoring case considerations.
                    if(item.compareToIgnoreCase(longestWord)<0)
                    {
                        longestWord = new String(item);
                    }
                }
            }
        }
        return longestWord;
    }
}
