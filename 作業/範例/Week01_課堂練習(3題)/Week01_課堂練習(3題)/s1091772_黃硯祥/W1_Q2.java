//Q2: 將使用者輸入的正整進行質因數分解
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2022/2/23

import java.util.*;
public class W1_Q2{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int i=2;

        System.out.printf("%d=",n);
        while(n>1){
            while(n!=1){
                if(n%i==0){
                    System.out.printf("%d",i);
                    if(n/i!=1){
                        System.out.printf("*");
                    }
                    n=n/i;       
                }
                else{
                    i++;
                }
            }
        }
    }
}
