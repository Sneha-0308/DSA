package com.binarysearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//it is kind of finding ceiling of a number  that is smallest number greater than target
public class SmallestLetter010 {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<letters[mid])
                end = mid-1;
            else
                start = mid+1;//WE ARE NOT RETURNING MID BECAUSE HERE CONDITION IS NOT GIVEN AS EQUAL IF THEY GIVE EQUAL TO
                              // THEN WE WILL BE RETURN THE MID
        }
        return letters[start % letters.length];//WHEN START<=END CONDITION VIOLATES THAT IS IF THE TARGET ELEMENT IS GREATER
                                               // THAN THE ELEMENT WHICH ARE PRESENT IN THE ARRAY THEN WE HAVE TO WRITE THE ELEMENT OF 0TH INDEX
    }
}
//class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//        int start = 0;
//        int end = letters.length - 1;
//
//        while(start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < letters[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return letters[start % letters.length];
//    }
//}