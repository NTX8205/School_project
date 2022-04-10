//Q3: 計算兩個正整數的最大公因數&最小公倍數
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2022/2/23

import java.util.*;
public class W1_Q3{
     public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);

       int x=sc.nextInt();
       int y=sc.nextInt();
       int max=1;

       System.out.printf("%d與%d的最大公因數為",x,y);
       for(int i=2;i<=x;i++){
           if(x%i==0 && y%i==0){
               max=i;
           }   
       } 
       System.out.printf("%d",max);
       System.out.println();
       System.out.printf("%d與%d的最小公倍數為",x,y);
       System.out.printf("%d",x*y/max);


    }
}
