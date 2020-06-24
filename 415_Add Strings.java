package com.company;
import java.lang.reflect.Array;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        System.out.println(addString("7","8251"));

    }

    public static String addString(String num1,String num2)
    {

        int lastTimeRemainder=0;
        StringBuilder sb=new StringBuilder();
        for(int i=num1.length()-1,j=num2.length()-1;i>=0||j>=0;i--,j--)
        {
            int n1,n2;
            if(i>=0) {
                n1 = num1.charAt(i) - '0';
            }
            else
            {
                n1=0;
            }

            if(j>=0) {
                n2 = num2.charAt(j) - '0';
            }
            else
            {
                n2=0;
            }

            int sum=n1+n2+lastTimeRemainder;
//            System.out.println(sum);
//            System.out.println(sum%10);
//            System.out.println(sum/10);
            lastTimeRemainder=sum/10;
            sb.append(sum%10);
        }
        if(lastTimeRemainder!=0)
        {
            sb.append(lastTimeRemainder);
        }

        //System.out.println(sb.reverse());
        return sb.reverse().toString();
    }
}
