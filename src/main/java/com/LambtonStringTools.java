package com.lambton;

public class LambtonStringTools {
    public String h;
    static public String reverse(String h)

    {
        String reversed="";
        for(int i=h.length()-1;i>0;i++) {
            reversed = reversed + h.charAt(i)
        }
        return(reversed)

    }


}
