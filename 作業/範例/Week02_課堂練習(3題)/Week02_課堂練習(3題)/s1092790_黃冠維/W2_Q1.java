//使用者輸入兩個正整數p,q,找出介於p到q之間的所有質數與質數總數
//資管二A 410927907 黃冠維
//Date:2022/03/03

import java.util.Scanner;
public class W2_Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int sum = 0;

        if(p>q){
            int temp;
            temp = p;
            p = q ;
            q = temp;
        }

        for(int i = p ; i<=q ; i++){ //p到q
            if(i == 1)
                i++;
            int count = 0;
            for(int j = 2 ; j < i ;j++){ //判斷i是否為質數
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(i+ " ");
                sum++;
            }
        }
        System.out.println();
        System.out.print("質數總數: "+sum);

    }

}