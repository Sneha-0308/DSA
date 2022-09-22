package com.leetCode.Arrays;

public class ContainerWithMostWater {
    static int area(int[] height){
        int i=0,j=height.length-1,result=0,h=0,w=0,temp=0;
        while (i<j){
             h=Math.min(height[i],height[j]);
             w=j-i;
             temp=h*w;
             if(result<temp)
                 result=temp;
             if(height[i]<height[j])
                 i++;
             else
                 j--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={6,4,2,5,4,6,1,3,5};
        System.out.println(area(arr));
    }
}
