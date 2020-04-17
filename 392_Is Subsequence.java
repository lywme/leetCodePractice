class Solution {
    public boolean isSubsequence(String s, String t) {
        int Pos=-1;

        for(int i=0;i<s.length();i++)
        {
            char cha=s.charAt(i);
            Pos=t.indexOf(cha,Pos+1);
            if(Pos==-1)
                return false;
        }
        return true;
    }
}
