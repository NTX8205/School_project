//Q1: [p,q]區間質數問題
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2022/3/2

import java.util.*;
public class W2_Q1{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt(),b=sc.nextInt();
        int c=0;
        int count=0;

        if(a>b){
            c=a;
            a=b;
            b=c;
        }

        for(int i=a; i<=b ; i++){
            for(int j=2; j<=i ; j++){
                if(i%j==0){
                    count=count+1;       
                    }
            }
            if(count==1){
                System.out.print(i+" ");
            }
            count=0;
        }
    }
}    