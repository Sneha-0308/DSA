package com.leetCode.Arrays;

import java.util.Arrays;

public class QueriesOnNumberofPointsInsideACircle {
    static int[] func(int[][] points, int[][] queries){
        int[] result=new int[queries.length];
        int x1,y1,r,x2,y2;
        for(int i=0;i<queries.length;i++){
            x1=queries[i][0];
            y1=queries[i][1];
            r=queries[i][2];
            for(int j=0;j<points.length;j++){
                x2=points[j][0];
                y2=points[j][1];
                if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)<=r*r)
                    result[i]++;
            }
        }
        return result;
    }
//    Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
//    Output: [3,2,2]
    public static void main(String[] args) {
        int[][] arr1={{1,3},{3,3},{5,3},{2,2}};
        int[][] arr2={{2,3,1},{4,3,1},{1,1,2}};
        System.out.println(Arrays.toString(func(arr1,arr2)));
    }
}
