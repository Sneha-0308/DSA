package com.TCS;

import java.util.Scanner;

public class Day1Slot2Q1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=1;i<n;i++){
            if(a[i]!=a[0])
                count++;
        }
        System.out.println(count);
    }
}
/*Question 1: Alice and her friends are playing a game of verbal Kho-Kho. Alice is acting as a mediator, and the rest of the N friends are seated on N chairs, one each.

Alice starts by providing a paper with a single digit number to the friend present at number 1. Let’s denote friends by F, where F will be of size N.

F[1]…F[N] represents friends seated respectively.

After receiving the paper with a digit, F[1] will enact and try to tell F[2] without speaking.

Similarly, F[2] will communicate to the next person i.e., F[3].

This continues until the last person F[N] understands the digit.

Finally, the last person will write the digit on a separate paper and will give it to Alice

Alice will compare both the papers. If the digits are similar then, Alice will give a T-shirt to each friend.

However, if the digits do not match then Alice will ask digits from each friend, and she will offer the T-shirts to only the ones who understood the digits correctly.

Given N number of friends and digit array D, denoting the digit understood by each friend F. find out how many of Alice’s friends have not enacted well OR did not understand the enactment by the previous friend correctly.

Example 1:

3 -> N, number of friends

4 4 4 – array D. denoting digit understanding by N friends

Output:

0

Explanation:

All of them have understood digits correctly.

Example 2:

5

1 2 3 2 2

Output:

4

Explanation:

1st, 2nd, 3rd and 4th friends could not enact OR understand the enactment.

Constraints:

1<=N<10000
0<=D[i]<=9
The input format for testing:

First-line Contains a Positive Integer denoting N
Next line: Contains N elements of the array space separated denoting array D.
The Output format for testing:

Output the single integer denoting how many have not enacted well OR have not understood the enactment.*/