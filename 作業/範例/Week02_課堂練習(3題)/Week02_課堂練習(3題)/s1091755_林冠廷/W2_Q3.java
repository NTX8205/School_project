//Q3:質因分解進階版
//
//班級:資管二B
//學號:410917554
//姓名:林冠廷
//
//date:2022/3/2

import java.util.*;
public class W2_Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=2;
        int count=0;

        while(x>1){
            while(x%i==0){
                count++;
                x=x/i;
            }
            if(count!=0){
                System.out.print(i+"^"+count);
                if(x!=1){
                    System.out.print("*");
                }
            }

            i++;
            count=0;

        }
    }
}
