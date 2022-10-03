package com.arrayIntroduction;

public class Prerana {
    static int fun(int[] order,int discount){
        int count=0;
        for(int i=0;i<order.length;i++){
            if(discount%order[i]==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,11};
        System.out.println(fun(arr,36));
    }
}





//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int sume=0;
//        int num=s.nextInt();
//        while (num!=0){
//            int rem=num%10;
//            if(rem%2!=0)
//                sume+=rem;
//            num/=10;
//        }
//        System.out.println(sume);
//
//    }