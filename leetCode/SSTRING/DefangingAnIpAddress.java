package com.leetCode.SSTRING;

public class DefangingAnIpAddress {
    static String func(String address){
//        address=address.replaceAll("[\\.]","[.]");
//        return address;
        String result="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.')
                result+="[.]";
            else
                result+=address.charAt(i);
        }
        return result;
    }
}
