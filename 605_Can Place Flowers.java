class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        
        int i=0,cnt=0;
        int len=flowerbed.length;
        while(i<len)
        {
            if(flowerbed[i]==0 && (i==0||flowerbed[i-1]==0) && (i==len-1||flowerbed[i+1]==0))
            {
                flowerbed[i]=1;
                cnt++;
            }
            i++;
            if(cnt==n) return true;
        }
        return false;
    }
}
