        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        //map.forEach((k,v)->System.out.println(k+" , "+v));

        for(int i=0;i<t.length();i++)
        {
            Character c=t.charAt(i);
            if(map.containsKey(c)&&map.get(c)>0)
            {
                map.put(c,map.get(c)-1);
            }
            else
            {
                return false;
            }
        }

        return true;
